package entidades;

public class Funcionario extends Pessoa{
    
    private String cargo;
    
    private String cnh;
    
    //metodo construtor com e sem parametros
    public Funcionario(){
        this.cargo = "";
        this.cnh = "";
    }

    public Funcionario(String cargo, String cnh){
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
    
    public boolean validaNome(){
        if(this.getNome().length() > 50 || this.getNome().length() < 3)
            return false;//Nome errado
        if(!this.getNome().matches("[a-zA-Z]+ [a-zA-Z]+"))
            return false;//Nome errado
        return true;
    }
                    
    
        
}