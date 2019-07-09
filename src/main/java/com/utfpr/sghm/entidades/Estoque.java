package com.utfpr.sghm.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESTOQUE")
public class Estoque {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="est_id")
    private int id;
    
    @Column(name="est_qtd_prod")
    private int quant_prod;
    
    public Estoque(){}
    
    public Estoque(final int id, final int quant){
        this.setId(id);
        this.setQuant(quant);
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuant() {
        return quant_prod;
    }

    public void setQuant(int quant_prod) {
        this.quant_prod = quant_prod;
    }
    
    public void validaCampos() throws Exception{
        if(!validaQuant())
            throw new Exception("Quantidade Incorreta");
    } 
    
    public boolean validaQuant(){
        if(this.getQuant() < 0)
            return false;//quantidade incorretA
            
            return true;
    }
}
