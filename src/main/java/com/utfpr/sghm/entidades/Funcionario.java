package com.utfpr.sghm.entidades;

import jdk.internal.jline.internal.TestAccessible;
import main.java.com.utfpr.sghm.entidades.Pessoa;

import java.lang.annotation.Inherited;
import java.security.Identity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario extends Pessoa{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="car_nome")
    private String cargo;
    @Column(name="func_cnh")
    private String cnh;
    
    //metodo construtor com e sem parametros
    Funcionario(){
        this.cargo = "";
        this.tipoFuncao = "";
        this.cnh = "";
    }

    Funcionario(String cargo, String tipoFuncao, String cnh){
        this.cargo = cargo;
        this.tipoFuncao = tipoFuncao;
        this.cnh = cnh;    
    }

    //getters & setters
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setTipoFuncao(String tipoFuncao){
        this.tipoFuncao = tipoFuncao;
    }

    public void setCNH(String cnh){
        this.cnh = cnh;
    }

    public String getCargo(){
        return this.cargo;
    }

    public String getTipoFuncao(){
        return this.tipoFuncao;
    }

    public String getCNH(){
        return this.cnh;
    }

    public void venderProduto(){}

    public void cadastrarCliente(){}


}