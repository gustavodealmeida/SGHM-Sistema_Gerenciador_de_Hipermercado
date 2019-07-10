
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
            throw new Exception("Telefone Inválida");
        }
    }
    
    public boolean validaNome(){
        if(this.getNome().length() > 100 || this.getNome().length() < 3)
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
    
    public boolean validaCnpj(){
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
        CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
        CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
        CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
        CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
       (CNPJ.length() != 14))
       return(false);
 
    char dig13, dig14;
    int sm, i, r, num, peso;
 
// "try" - protege o código para eventuais erros de conversao de tipo (int)
    try {
// Calculo do 1o. Digito Verificador
      sm = 0;
      peso = 2;
      for (i=11; i>=0; i--) {
// converte o i-ésimo caractere do CNPJ em um número:
// por exemplo, transforma o caractere '0' no inteiro 0
// (48 eh a posição de '0' na tabela ASCII)
        num = (int)(CNPJ.charAt(i) - 48);
        sm = sm + (num * peso);
        peso = peso + 1;
        if (peso == 10)
           peso = 2;
      }
 
      r = sm % 11;
      if ((r == 0) || (r == 1))
         dig13 = '0';
      else dig13 = (char)((11-r) + 48);
 
// Calculo do 2o. Digito Verificador
      sm = 0;
      peso = 2;
      for (i=12; i>=0; i--) {
        num = (int)(CNPJ.charAt(i)- 48);
        sm = sm + (num * peso);
        peso = peso + 1;
        if (peso == 10)
           peso = 2;
      }
 
      r = sm % 11;
      if ((r == 0) || (r == 1))
         dig14 = '0';
      else dig14 = (char)((11-r) + 48);
 
// Verifica se os dígitos calculados conferem com os dígitos informados.
      if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
         return(true);
      else return(false);
    } catch (InputMismatchException erro) {
        return(false);
    }
  }
 
  public static String imprimeCNPJ(String CNPJ) {
// máscara do CNPJ: 99.999.999.9999-99
    return(CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." +
      CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" +
      CNPJ.substring(12, 14));
  }
 }

