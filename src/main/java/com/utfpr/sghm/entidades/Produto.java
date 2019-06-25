package com.utfpr.sghm.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto {
    @Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="prod_cod_barras")
    private String cod_barras;
    
    @Column(name="prod_nome")
    private String nome;
    
    @Column(name="prod_categoria")
    private String categoria;
    
    @Column(name="prod_marca")
    private String marca;
    
    @Column(name="prod_massa")
    private double massa;
    
    @Column(name="prod_custo_uni")
    private double custo_uni;
    
    @Column(name="prod_preco")
    private double preco;
    
    @ManyToOne
    @Column(name="est_id")
    private int est_id;
    
    public Produto(){}
    
    public Produto(String cod_barras, String nome, String categoria, String marca, 
                    double massa, double custo_uni, double preco, int est_id){
        this.setCod_barras(cod_barras);
        this.setNome(nome);
        this.setCategoria(categoria);
        this.setMarca(marca);
        this.setMassa(massa);
        this.setCusto_uni(custo_uni);
        this.setPreco(preco);
        this.setEst_id(est_id);             
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getCusto_uni() {
        return custo_uni;
    }

    public void setCusto_uni(double custo_uni) {
        this.custo_uni = custo_uni;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEst_id() {
        return est_id;
    }

    public void setEst_id(int est_id) {
        this.est_id = est_id;
    }
    
    
}
