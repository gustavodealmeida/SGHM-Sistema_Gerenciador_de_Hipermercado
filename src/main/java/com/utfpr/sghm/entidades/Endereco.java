package com.utfpr.sghm.entidades;

import java.security.Identity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ENDERECO")
public class Endereco {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="end_id")
	private int id;
	@Column(name="end_rua")
	private String rua;
	@Column(name="end_numero")
        private int numero;
	@Column(name="end_complemento")
	private String complemento;
	@Column(name="end_bairro")
	private String bairro;
	@Column(name="end_cidade")
	private String cidade;
	@Column(name="end_estado")
	private String estado;
	@Column(name="end_cep")
	private String cep;
    
    //Método construtor
    public Endereco(){}
    
    //Construtor com polimorfismo
    public Endereco(String rua, int numero, String complemento, String bairro, String cidade,
			String estado, String cep) {
			
			this.setRua(rua);
			this.setNumero(numero);
			this.setComplemento(complemento);
			this.setBairro(bairro);
			this.setCidade(cidade);
			this.setEstado(estado);
			this.setCep(cep);
	}
	
	
	//Getters e Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
