package entidades;

import java.security.Identity;
import java.util.Date;
import entidades.Endereco;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.*;


public class Pessoa{
    
    private String cpf;
    
    private String nome;
    
    private Date nasc;
   
    private String docId;
    
    private String tipoDocId;
   
    private String email;
   
    private String telefone;
    
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
        return this.getEmail().matches("[a-zA-Z0-9]{2,}@[a-zA-Z0-9]{2,}(\\.[a-zA-Z0-9]{2,})+");
    }
    
    public boolean validaTelefone(){
        if(this.getTelefone().length() == 8 || 
                this.getTelefone().length() == 10 || 
                this.getTelefone().length() == 12 )
            return true;
        return false;
    }

    public boolean validaSexo(){
        if(this.getSexo().equalsIgnoreCase("M") || this.getSexo().equalsIgnoreCase("F"))
            return true;
        return false;
    }
    
    public boolean validaCPF(){
        Utils u = new Utils();
        return u.validaCPF(getCPF());
    }
}