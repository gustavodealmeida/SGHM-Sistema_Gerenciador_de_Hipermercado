
package entidades;

import java.util.InputMismatchException;


public class Fornecedor {
	
    private String CNPJ;
		
	private String nome;
	   
	private String telefone;
	private String email;
	
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
    
    public void validaCampos() throws Exception{
        if(!validaNome()){
            throw new Exception("Nome Inválido");
        }
        if(!validaCnpj()){
            throw new Exception("CNPJ Inválido");
        }
        if(!validaEmail()){
            throw new Exception("Email Inválido");
        }
        if(!validaTelefone()){
            throw new Exception("Telefone Inválido");
        }
    }
    
    public boolean validaNome(){
        if(this.getNome().length() > 50 || 
                this.getNome().length() < 3)
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
    
    public boolean validaCnpj(){
        Utils u = new Utils();
        return u.validaCnpj(this.getCNPJ());
    }
 
//  public static String imprimeCNPJ(String CNPJ) {
// máscara do CNPJ: 99.999.999.9999-99
//    return(CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." +
//      CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" +
//      CNPJ.substring(12, 14));
//  }
}

