package entidades;

public class Endereco {
	
	private int id;
	
	private String rua;
	
        private int numero;
	
	private String complemento;
	
	private String bairro;
	
	private String cidade;
	
	private String estado;
	
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
        public void validaCampos() throws Exception{
        if(!validaRua())
            throw new Exception("Rua Inválida");
        if(!validaNumero())
            throw new Exception("Número Inválido");
        if(!validaComplemento())
            throw new Exception("Complemento Inválido");
        if(!validaBairro())
            throw new Exception("Bairro Inválido");
        if(!validaCidade())
            throw new Exception("Cidade Inválida");
        if(!validaEstado())
            throw new Exception("Estado Inválido");
        if(!validaCep())
            throw new Exception("Cep Inválido");
    }
        
	public boolean validaRua(){
            if(this.getRua().length() > 50 || 
                    this.getRua().length() < 5)
                return false;//Rua errada
            //if(!this.getRua().matches("[a-zA-Z]+([' ']?[a-zA-Z]+)*"))
                //return false;//Rua errada
        return true;
        }
        
        public boolean validaComplemento(){
            if(this.getComplemento().length() > 50 || 
                    this.getComplemento().length() < 5)
                return false;//Complemento errado
            //if(!this.getComplemento().matches("[a-zA-Z]+([' ']?[a-zA-Z]+)*"))
               // return false;//Complemento errado
        return true;
        }
        
        public boolean validaBairro(){
            if(this.getBairro().length() > 50 || 
                    this.getBairro().length() < 5)
                return false;//bairro errado
            //if(!this.getBairro().matches("[a-zA-Z]+([' ']?[a-zA-Z]+)*"))
                //return false;//bairro errado
        return true;
        }
        
        public boolean validaCidade(){
            if(this.getCidade().length() > 50 || 
                    this.getCidade().length() < 5)
                return false;//Cidade errada
            //if(!this.getCidade().matches("[a-zA-Z]+([' ']?[a-zA-Z]+)*"))
                //return false;//Cidade errada
        return true;
        }
        
        public boolean validaNumero(){
            if(this.getNumero() <= 0)
                return false;//numero incorreto
            
            return true;
        }
        
        public boolean validaEstado(){
            if(this.getEstado().length() > 50 || 
                    this.getEstado().length() < 3)
                return false;//estado errado
            //if(!this.getEstado().matches("[a-zA-Z0]+([' ']?[a-zA-Z]+)*"))
                //return false;//estado errado
            
            return true;
        }
        
        public boolean validaCep(){
            if(!this.getCep().matches("[0-9]{8}"))
                return false;//cep errado
           
            return true;
        }
}
