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
        
        try{
            p.validaCampos();
        }catch(Exception e){
            System.out.println(e.getMessage());
            fail();
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
