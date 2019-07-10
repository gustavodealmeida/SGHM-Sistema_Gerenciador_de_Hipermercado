/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entidades.Endereco;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gustavo
 */
public class EnderecoJanelaTest {
    
    public EnderecoJanelaTest() {
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
     public void testeJanela() {
         List<Endereco> endList = new ArrayList<Endereco>();         
         EnderecoWindow janela = new EnderecoWindow(endList);
                    
     }
     
     //@Test
     public void testeCreate() {
         List<Endereco> endList = new ArrayList<Endereco>();         
         EnderecoWindow janela = new EnderecoWindow(endList);
         
     }
    
     
}
