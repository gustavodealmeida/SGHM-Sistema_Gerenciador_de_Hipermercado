package entidades;

public class Produto {
    
    private String cod_barras;
    
  
    private String nome;
    
  
    private String categoria;
    
   
    private String marca;
    
 
    private double massa;
    

    private double custo_uni;
    
 
    private double preco;
 
    private int est_id;
    
    public Produto(){}
    
    public Produto(String cod_barras, String nome, String categoria, String marca, 
                    double massa, double custo_uni, double preco, int est_id){
        this.setCod_barras(cod_barras);
        this.setNome(nome);
        this.setCategoria(categoria);
        this.setMarca(marca);
        this.setMassa(massa);
        this.setCusto_uni(custo_uni);
        this.setPreco(preco);
        this.setEst_id(est_id);             
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getCusto_uni() {
        return custo_uni;
    }

    public void setCusto_uni(double custo_uni) {
        this.custo_uni = custo_uni;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEst_id() {
        return est_id;
    }

    public void setEst_id(int est_id) {
        this.est_id = est_id;
    }
    
    public boolean validaCod_barras(){
        return !(this.getCod_barras().length() > 50 || 
                this.getCod_barras().length() < 1);    
    }
    
    public boolean validaNome(){
        if(this.getNome().length() > 50 || 
                this.getNome().length() < 3)
            return false;//Nome errado
        //if(!this.getNome().matches("[a-zA-Z]+ [a-zA-Z]+"))
            //return false;//Nome errado
        return true;
    }
    
    public boolean validaCategoria(){
        if(this.getCategoria().length() > 50 || 
                this.getCategoria().length() < 3)
            return false;//Categoria errada
        //if(!this.getCategoria().matches("[a-zA-Z]+ [a-zA-Z]+"))
            //return false;//Categoria errada
        return true;
    }
    
    public boolean validaMarca(){
        if(this.getMarca().length() > 50 || 
                this.getMarca().length() < 2)
            return false;//Categoria errada
        //if(!this.getMarca().matches("[a-zA-Z]+ [a-zA-Z]+"))
            //return false;//Categoria errada
        return true;
    }
    
    public boolean validaMassa(){
        if(this.getMassa() < 0.00)
            return false;//Massa errada
        return true;
    }
    
    public boolean validaCusto_uni(){
        if(this.getCusto_uni() < 0.00)
            return false;//Custo da unidade errada
        return true;
    }
    
    public boolean validaPreco(){
        if(this.getPreco() < 0.00)
            return false;//Preço errado
        return true;
    }
}
