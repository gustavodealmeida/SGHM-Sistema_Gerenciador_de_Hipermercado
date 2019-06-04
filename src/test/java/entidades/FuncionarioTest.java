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

/**
 *
 * @author Deco
 */
public class FuncionarioTest {
    
    public FuncionarioTest() {
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
    public void temEndereco() {
        try{
            //verificar se tem endereco
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cargo(){
        try{
            //verificar qual cargo é
        }
        catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cnh(){
        try{
            //verificar cnh -> apenas 11 numeros
        }catch(Exception e){
            fail();
        }
    }
}
