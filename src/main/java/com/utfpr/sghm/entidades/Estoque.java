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
    private String quant_prod;
    
    public Estoque(){}
    
    public Estoque(final int id, final String quant){
        this.setId(id);
        this.setQuant(quant);
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuant() {
        return quant_prod;
    }

    public void setQuant(String quant_prod) {
        this.quant_prod = quant_prod;
    }
    
    
}
