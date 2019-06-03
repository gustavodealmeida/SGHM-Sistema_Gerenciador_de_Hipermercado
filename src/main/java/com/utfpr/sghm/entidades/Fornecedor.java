/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.sghm.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Jhiovane
 */

@Entity
@Table(name = "FORNECEDOR")
public class Fornecedor implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="for_id")
    private int id;
    @Column(name="for_nome")
    private String nome;
    @Column(name="for_cnpj")
    private String CNPJ;
    @Column(name="for_email")
    private String email;
    @Column(name="for_tel")
    private String telefone;
    @OneToOne
    private Endereco endereco;

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
