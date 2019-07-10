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
import entidades.Estoque;

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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void estoqueCorreto(){
        Estoque est = new Estoque(1, 1);
        
        try{
            est.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void nomeSuperior(){
        Estoque est = new Estoque();
        est.setId(1);
        est.setQuant(-2);
        
        try{
            est.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Quantidade Incorreta");
        }
    }
}
