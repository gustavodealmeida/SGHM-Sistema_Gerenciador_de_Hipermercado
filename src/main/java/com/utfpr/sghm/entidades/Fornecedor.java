/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.sghm.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FORNECEDOR")
public class Fornecedor {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="for_cnpj")
    private String CNPJ;
	@Column(name="for_nome")	
	private String nome;
	@Column(name="for_telefone")    
	private String telefone;
	@Column(name="for_email")	
	private String email;
	@ManyToOne
	@Column(name="end_id")//nem precisava, mas só pra manter o padrão..
	private int end_id;

    public Fornecedor() {}

    public Fornecedor(String nome, String CNPJ, String telefone, String email, int end_id) {
        this.setNome(nome);
        this.setCNPJ(CNPJ);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setEnd_id(end_id);
    }

	//Getters and Setters
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

    public int getEnd_id() {
	return end_id;
    }

    public void setEnd_id(int end_id) {
        this.end_id = end_id;
    }
    
    
}
