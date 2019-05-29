/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.sghm.entidades;

/**
 *
 * @author Jhiovane
 */
public class Fornecedor {
    private String nome;
    private String CNPJ;
    private String email;
    private String telefone;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String CNPJ, String email, String telefone) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
