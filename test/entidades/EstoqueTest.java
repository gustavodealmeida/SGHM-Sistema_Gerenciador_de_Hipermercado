/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author prado
 */
public class EstoqueTest {
    public EstoqueTest() {
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
    
    @Test
    public void estoqueConstrutor(){
        Estoque es = new Estoque(2, 500);
        
        try{
            es.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void construtor(){
        Estoque es = new Estoque();
        
        es.setId(10);
        
        try{
            assertEquals(es.getId(), 10);
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void quantidadeValida(){
        Estoque es = new Estoque();
        
        es.setQuant(5874);
        
        try{
            assertTrue(es.validaQuant());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void quantidadeInvalida(){
        Estoque es = new Estoque();
        
        es.setQuant(-2481);
        
        try{
            es.validaCampos();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Quantidade Incorreta");
        }
    }
}
