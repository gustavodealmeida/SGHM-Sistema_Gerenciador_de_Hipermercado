package entidades;

import java.sql.Date;

public class Funcionario extends Pessoa{
    
    private String cargo;
    
    private String cnh;
    
    //metodo construtor com e sem parametros
    public Funcionario(){
        super();
        this.cargo = "";
        this.cnh = "";
    }

    public Funcionario(String nome, String cpf, Date nasc,String docId, String tipoDocId, String email, String telefone, String sexo, String cargo, String cnh){
        super(nome, cpf, nasc, docId, tipoDocId, email, telefone, sexo);
        this.cargo = cargo;
        this.cnh = cnh;    
    }

    //getters & setters
    public void setCargo(String cargo){
        this.cargo = cargo;
    }



    public void setCNH(String cnh){
        this.cnh = cnh;
    }

    public String getCargo(){
        return this.cargo;
    }



    public String getCNH(){
        return this.cnh;
    }

    public void venderProduto(){}

    public void cadastrarCliente(){}

    
                ////Validações*/

    public void validaCampos() throws Exception{
        super.validaCampos();
        if(!validaCargo()){
            throw new Exception("Cargo Inválido");
        }
        if(!validaCNH()){
            throw new Exception("CNH Inválida");
        }          
    }
    
    public boolean validaCargo(){
        if(this.getCargo().equalsIgnoreCase("gerente") || this.getCargo().equalsIgnoreCase("chefe") || this.getCargo().equalsIgnoreCase("funcionario"))
            return true;
        return false;
    }
    public boolean validaCNH(){
        if(this.getCNH().matches("[0-9]{11}"))
            return true;
        if(this.getCNH().length() == 11)
            return true;
        
        return false;
    }    
}