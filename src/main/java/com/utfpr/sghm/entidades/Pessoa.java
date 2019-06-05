package com.utfpr.sghm.entidades;

import java.security.Identity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.utfpr.sghm.entidades.Endereco;

@Entity
@Table(name = "PESSOA")
public class Pessoa{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="pes_cpf")
    private String cpf;
    @Column(name="pes_nome")
    private String nome;
    @Column(name="pes_nascimento")
    private Date nasc;
    @Column(name="pes_doc_identificacao")
    private String docId;
    @Column(name="pes_tipo_doc_identificacao")
    private String tipoDocId;
    @Column(name="pes_email")
    private String email;
    @Column(name="pes_telefone")
    private String telefone;
    @Column(name="pes_sexo")
    private String sexo;
    //?
    private Endereco endereco;

    //metodos construtor
    public Pessoa(){
        this.cpf = "";
        this.nome = "";
        this.nasc = null;
        this.docId = "";
        this.tipoDocId = "";
        this.email = "";
        this.telefone = "";
        this.sexo = "";
        this.endereco = null;
    }

    public Pessoa(String nome, String cpf, Date nasc,String docId, String tipoDocId, String email, String telefone, String sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.nasc = nasc;
        this.docId = docId;
        this.tipoDocId = tipoDocId;
        this.email = email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.endereco = null;
    }

    //getters e setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public void setNasc(Date nasc){
        this.nasc = nasc;
    }

    public void setdocId(String docId){
        this.docId = docId;
    }

    public void setTipoDocId(String tipoDocId){
        this.tipoDocId = tipoDocId;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    ////////////////////////////////////

    public String getNome(String nome){
        return this.nome;
    }

    public String getCPF(){
        return this.cpf;
    }

    public Date getNasc(){
        return this.nasc;
    }

    public String getdocId(){
        return this.docId;
    }

    public String getTipoDocId(){
        return this.tipoDocId;
    }

    public String getEmail(){
        return this.email;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getSexo(){
        return this.sexo;
    }
    

    //Valida CPF
    public boolean validaCPF(){return false;
}

}