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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.*;

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
        this.nasc = null;       ////////////////
        this.docId = "";        /////////////
        this.tipoDocId = "";    //////////
        this.email = "";
        this.telefone = "";
        this.sexo = "";
        this.endereco = null;   ////////////
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

    public String getNome(){
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
    

 
 
    
    public void validaCampos() throws Exception{
        if(!validaNome())
            throw new Exception("Nome Inválido");
        if(!validaEmail())
            throw new Exception("Email Inválido");
        if(!validaTelefone())
            throw new Exception("Telefone Inválido");
        if(!validaSexo())
            throw new Exception("Sexo Inválido");
        if(!validaCPF())
            throw new Exception("CPF Inválido");
 //       if(!validaNasc())
     //           throw new Exception("Data de Nascimento Inválida");
    }
        
    public boolean validaNome(){
        if(this.getNome().length() > 45 || this.getNome().length() < 3)
            return false;//Nome errado
        if(!this.getNome().matches("[a-zA-Z]+ [a-zA-Z]+"))
            return false;//Nome errado
        return true;
    }
    
    public boolean validaEmail(){
        if(this.getEmail().matches("[a-zA-Z0-9]{2,}@[a-zA-Z0-9]{2,}(\\.[a-zA-Z0-9]{2,})+"))
            return true;
        return false;
    }
    
    public boolean validaTelefone(){
        if(this.getTelefone().matches("[0-9]+")&& this.getTelefone().length() == 8 || this.getTelefone().length() == 10 || this.getTelefone().length() == 12 )
            return true;
        return false;
    }

    public boolean validaSexo(){
        if(this.getSexo().equalsIgnoreCase("M") || this.getSexo().equalsIgnoreCase("F"))
            return true;
        return false;
    }
    
    public boolean validaCPF(){
        String CPF = getCPF();
        if (CPF.equals("00000000000") ||
	        CPF.equals("11111111111") ||
	        CPF.equals("22222222222") || CPF.equals("33333333333") ||
	        CPF.equals("44444444444") || CPF.equals("55555555555") ||
	        CPF.equals("66666666666") || CPF.equals("77777777777") ||
	        CPF.equals("88888888888") || CPF.equals("99999999999") ||
	        (CPF.length() != 11))
            return(false);
        char dig10, dig11;
        int sm, i, r, num, peso;
        try {
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            }else {
                dig10 = (char)(r + 48);
            }
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char)(r + 48);
            }
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
                return(true);
            } else {
                return(false);
            }
        }catch (InputMismatchException erro) {
            return(false);
        }
    }
    
    public boolean validaNasc(){
        Date data = getNasc();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate d = LocalDate.parse((CharSequence)data, formatter);
            return true;
        }catch (DateTimeParseException e) {
            return false;
      }   
   }
    //verifica se a data que esta tentando ser digitada não é uma data do futuro
    public boolean dataMenorQueHoje(Date data) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataVerificada = LocalDate.parse((CharSequence) data, dtf);
        LocalDate hoje = LocalDate.now();
        return dataVerificada.compareTo(hoje) <= 0;
    }
    
}