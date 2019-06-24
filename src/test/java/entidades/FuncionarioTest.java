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
import com.utfpr.sghm.entidades.Funcionario;

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
    

                    /*Testando Cargos válidos e inválidos*/
    @Test
    public void cargoChefe(){
        Funcionario f = new Funcionario();
        f.setCargo("chefe");        
        f.setCNH("11122233300");
        f.setNome("Anderson Felipe");
        try{
            f.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cargoGerente() {
        Funcionario f = new Funcionario();
        f.setCargo("Gerente");
        f.setCNH("11122233300");
        f.setNome("Anderson Felipe");
        try{
            f.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
        
    @Test
    public void cargoFuncionario(){
        Funcionario f = new Funcionario();
        f.setCargo("Funcionario");
        f.setCNH("11122233300");
        f.setNome("Anderson Felipe");
        try{
            f.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cargoInvalido(){
        Funcionario f = new Funcionario();
        f.setCargo("Estudante");
        f.setCNH("11122233300");
        try{
            f.validaCampos();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Cargo Inválido");
        }
    }
    
    
                    /*Testando Limites CNH*/
    @Test
    public void cnhInferior(){
        Funcionario f = new Funcionario();
        f.setCargo("Chefe");
        f.setCNH("1112223330");
        try{
            f.validaCampos();
        }catch(Exception e){
            assertEquals(e.getMessage(), "CNH Inválida");
        }
    }
    
    @Test
    public void cnhSuperior(){
        Funcionario f = new Funcionario();
        f.setCargo("Chefe");
        f.setCNH("11122233300Z");
        try{
            f.validaCampos();
        }catch(Exception e){
            assertEquals(e.getMessage(), "CNH Inválida");
        }
    }
    
    @Test
    public void cnhCaracterEspecial(){
        Funcionario f = new Funcionario();
        f.setCargo("chefe");
        f.setCNH("111222333xx");
        f.setNome("Anderson Felipe");
        try{
            f.validaCampos();
        }catch(Exception e){
            assertEquals(e.getMessage(), "CNH Inválida");
        }
    }
    
    @Test 
    public void cnhCorreta(){
        Funcionario f = new Funcionario();
        f.setCargo("chefe");
        f.setCNH("11122233300");
        f.setNome("Anderson Felipe");
        try{
            f.validaCampos(); 
        }catch(Exception e){
            fail();
        } 
    }

}