/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import entidades.Produto;

/**
 *
 * @author Gustavo
 */
public class ProdutoTest {
    
    public ProdutoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void produtoCORRETO(){

        Produto p = new Produto();
        p.setCategoria("Alimento");
        p.setCod_barras("1234");
        p.setCusto_uni(2.00);
        p.setMarca("UTFPR");
        p.setMassa(0.500);
        p.setNome("Macarrão");
        
        try{
            p.validaCampos();
        }catch(Exception e){
            System.out.println(e.getMessage());
            fail();
        }
    }
    
    @Test
    public void produtoContrutor(){
        Produto p = new Produto("1234", "Macarrão", "Alimento", "UTFPR", 0.500, 2.00, 3.00, 20);
        
        try{
            p.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    //========== Validando Codidgo de Barras =================
    @Test
    public void codigo_barrasInvalido(){

        Produto p = new Produto();
        p.setCategoria("Alimento");
        p.setCod_barras("");
        p.setCusto_uni(2.00);
        p.setMarca("UTFPR");
        p.setMassa(0.500);
        p.setNome("Macarrão");
        
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Código de Barras Inválido");
        }
    }
    
    //========== Validando NOME PRODUTO =================
    @Test
    public void nomeInferior(){

        Produto p = new Produto();
        p.setCategoria("Alimento");
        p.setCod_barras("1234");
        p.setCusto_uni(2.00);
        p.setMarca("UTFPR");
        p.setMassa(0.500);
        p.setNome("Ma");
        
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Nome Inválido");
        }
    }
    
    @Test
    public void nomeSuperior(){

        Produto p = new Produto();
        p.setCategoria("Alimento");
        p.setCod_barras("1234");
        p.setCusto_uni(2.00);
        p.setMarca("UTFPR");
        p.setMassa(0.500);
        p.setNome("Macarrãoaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Nome Inválido");
        }
    }
    
    //========== Validando CATEGORIA =================
    @Test
    public void categoriaInferior(){

        Produto p = new Produto();
        p.setCategoria("Al");
        p.setCod_barras("1234");
        p.setCusto_uni(2.00);
        p.setMarca("UTFPR");
        p.setMassa(0.500);
        p.setNome("Macarrão");
        
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Categoria Inválida");
        }
    }
    
    @Test
    public void categoriaSuperior(){

        Produto p = new Produto();
        p.setCategoria("Alimentoaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setCod_barras("1234");
        p.setCusto_uni(2.00);
        p.setMarca("UTFPR");
        p.setMassa(0.500);
        p.setNome("Macarrão");
        
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Categoria Inválida");
        }
    }
    
    //========== Validando NOME PRODUTO =================
    @Test
    public void marcaInferior(){

        Produto p = new Produto();
        p.setCategoria("Alimento");
        p.setCod_barras("1234");
        p.setCusto_uni(2.00);
        p.setMarca("");
        p.setMassa(0.500);
        p.setNome("Macarrão");
        
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            //System.out.println(e.getMessage());
            assertEquals(e.getMessage(), "Marca Inválida");
        }
    }
    
    @Test
    public void marcaSuperior(){

        Produto p = new Produto();
        p.setCategoria("Alimento");
        p.setCod_barras("1234");
        p.setCusto_uni(2.00);
        p.setMarca("UTFPRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMassa(0.500);
        p.setNome("Macarrão");
        
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            //System.out.println(e.getMessage());
            assertEquals(e.getMessage(), "Marca Inválida");
        }
    }
    
    //=============== MASSA ===================
    @Test
    public void massaInvalida(){

        Produto p = new Produto();
        p.setCategoria("Alimento");
        p.setCod_barras("1234");
        p.setCusto_uni(2.00);
        p.setMarca("UTFPR");
        p.setMassa(-0.500);
        p.setNome("Macarrão");
        
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Massa Inválida");
        }
        
    }
    
    //=============== CUSTO UNIDADE ===================
    @Test
    public void custoInvalido(){

        Produto p = new Produto();
        p.setCategoria("Alimento");
        p.setCod_barras("1234");
        p.setCusto_uni(-2.00);
        p.setMarca("UTFPR");
        p.setMassa(0.500);
        p.setNome("Macarrão");
        
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Custo da Unidade Inválida");
        }
        
    }
    
    //=============== PREÇO ===================
    @Test
    public void precoInvalido(){

        Produto p = new Produto();
        p.setCategoria("Alimento");
        p.setCod_barras("1234");
        p.setCusto_uni(2.00);
        p.setMarca("UTFPR");
        p.setMassa(0.500);
        p.setNome("Macarrão");
        p.setPreco(-3.00);
        
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Preço Inválido");
        }
        
    }
    
    
    
    
    /*/========== Validando NOME PRODUTO =================
    @Test
    public void nomeInferior(){

        Produto p = new Produto();
        p.setCategoria("Alimento");
        p.setCod_barras("1234");
        p.setCusto_uni(2.00);
        p.setMarca("UTFPR");
        p.setMassa(0.500);
        p.setNome("Macarrão");
        
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            //System.out.println(e.getMessage());
            assertEquals(e.getMessage(), "Nome Inválido");
        }
    }
    
    @Test
    public void nomeSuperior(){

        Produto p = new Produto();
        p.setCategoria("Alimento");
        p.setCod_barras("1234");
        p.setCusto_uni(2.00);
        p.setMarca("UTFPR");
        p.setMassa(0.500);
        p.setNome("Macarrão");
        
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            //System.out.println(e.getMessage());
            assertEquals(e.getMessage(), "Nome Inválido");
        }
    }
    /*
    @Test
    public void enderecoConstrutor(){
        
        Endereco end = new Endereco("Alberto Carazzai", 123, "Nao tem", "Centro", "Cornélio", "Parana", "12345678");
        
        try{
            end.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    //=========== Testes em relação a rua =====================
    
    @Test
    public void ruaInferior(){
        Endereco end = new Endereco();
        end.setRua("Alb");
        end.setBairro("Centro");
        end.setCep("12345678");
        end.setCidade("Cornélio");
        end.setEstado("Parana");
        end.setComplemento("Nao tem");
        end.setNumero(123);
        
        try{
            end.validaCampos();            
        }catch(Exception e){
            assertEquals(e.getMessage(), "Rua Inválida");
        }
    }*/
}
