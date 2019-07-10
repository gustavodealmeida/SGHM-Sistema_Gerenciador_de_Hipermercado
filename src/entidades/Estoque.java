package entidades;

public class Estoque {
    
    private int id;
    
    private int quant_prod;
    
    public Estoque(){}
    
    public Estoque(final int id, final int quant){
        this.setId(id);
        this.setQuant(quant);
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuant() {
        return quant_prod;
    }

    public void setQuant(int quant_prod) {
        this.quant_prod = quant_prod;
    }
    
    public void validaCampos() throws Exception{
        if(!validaQuant())
            throw new Exception("Quantidade Incorreta");
    } 
    
    public boolean validaQuant(){
        if(this.getQuant() < 0)
            return false;//quantidade incorretA
            
            return true;
    }
}
