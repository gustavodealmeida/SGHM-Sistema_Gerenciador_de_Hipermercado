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
    public void enderecoCORRETO(){

        Produto p = new Produto();
        p.setCategoria("Alimento");
        p.setCod_barras("1234");
        p.setCusto_uni(2.00);
        p.setMarca("UTFPR");
        p.setMassa(0.500);
        p.setNome("Macarrão");
        p.setPreco(500);
        p.setEst_id(15);
        
        try{
            assertTrue(p.validaCod_barras());
            assertTrue(p.validaNome());
            assertTrue(p.validaCategoria());
            assertTrue(p.validaMarca());
            assertTrue(p.validaCusto_uni());
            assertTrue(p.validaMassa());
            assertTrue(p.validaPreco());
            assertEquals(p.getEst_id(), 15);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            fail();
        }
    }
    
    
    @Test
    public void produtoConstrutor(){
        
        Produto p = new Produto("25254", "Bolacha", "Bolacha", "Passatempo", 
                5.5, 2.30, 2.30, 50);
        
        try{
            
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void IncorretoCodMenor(){
        Produto p = new Produto();
        
        p.setCod_barras("");
        p.setNome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setCategoria("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMarca("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMassa(5);
        p.setCusto_uni(5);
        p.setPreco(5);

        try{
            assertFalse(p.validaCod_barras());            
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void IncorretoCodMaior(){
        Produto p = new Produto();
        
        p.setCod_barras("1111111111111111111111111111111111111111111111111111111111111111111");
        p.setNome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setCategoria("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMarca("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMassa(5);
        p.setCusto_uni(5);
        p.setPreco(5);

        try{
            assertFalse(p.validaCod_barras());            
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void IncorretoNomeMenor(){
        Produto p = new Produto();
        
        p.setCod_barras("1111111111111111111111111111111111111111111111111111");
        p.setNome("a");
        p.setCategoria("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMarca("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMassa(5);
        p.setCusto_uni(5);
        p.setPreco(5);

        try{
            assertFalse(p.validaNome());            
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void IncorretoNomeMaior(){
        Produto p = new Produto();
        
        p.setCod_barras("1111111111111111111111111111111111111111111111111111");
        p.setNome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setCategoria("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMarca("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMassa(5);
        p.setCusto_uni(5);
        p.setPreco(5);

        try{
            assertFalse(p.validaNome());            
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void IncorretoCatMenor(){
        Produto p = new Produto();
        
        p.setCod_barras("1111111111111111111111111111111111111111111111111111");
        p.setNome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setCategoria("a");
        p.setMarca("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMassa(5);
        p.setCusto_uni(5);
        p.setPreco(5);

        try{
            assertFalse(p.validaCategoria());            
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void IncorretoCatMaior(){
        Produto p = new Produto();
        
        p.setCod_barras("1111111111111111111111111111111111111111111111111111");
        p.setNome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setCategoria("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMarca("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMassa(5);
        p.setCusto_uni(5);
        p.setPreco(5);

        try{
            assertFalse(p.validaCategoria());            
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void IncorretoMarcaMenor(){
        Produto p = new Produto();
        
        p.setCod_barras("1111111111111111111111111111111111111111111111111111");
        p.setNome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setCategoria("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMarca("a");
        p.setMassa(5);
        p.setCusto_uni(5);
        p.setPreco(5);

        try{
            assertFalse(p.validaMarca());            
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void IncorretoMarcaMaior(){
        Produto p = new Produto();
        
        p.setCod_barras("1111111111111111111111111111111111111111111111111111");
        p.setNome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setCategoria("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMarca("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMassa(5);
        p.setCusto_uni(5);
        p.setPreco(5);

        try{
            assertFalse(p.validaMarca());            
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void IncorretoMassa(){
        Produto p = new Produto();
        
        p.setCod_barras("1111111111111111111111111111111111111111111111111111");
        p.setNome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setCategoria("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMarca("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMassa(-5);
        p.setCusto_uni(5);
        p.setPreco(5);

        try{
            assertFalse(p.validaMassa());            
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void IncorretoCusto(){
        Produto p = new Produto();
        
        p.setCod_barras("1111111111111111111111111111111111111111111111111111");
        p.setNome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setCategoria("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMarca("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMassa(5);
        p.setCusto_uni(-5);
        p.setPreco(5);

        try{
            assertFalse(p.validaCusto_uni());            
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void IncorretoPreco(){
        Produto p = new Produto();
        
        p.setCod_barras("1111111111111111111111111111111111111111111111111111");
        p.setNome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setCategoria("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMarca("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        p.setMassa(5);
        p.setCusto_uni(5);
        p.setPreco(-5);

        try{
            assertFalse(p.validaPreco());            
        }catch(Exception e){
            fail();
        }
    }
}
