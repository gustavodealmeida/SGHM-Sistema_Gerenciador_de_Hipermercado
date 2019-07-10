/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidades.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author Deco
 */
public class PessoaTest {
    
    public PessoaTest() {
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
    
                    /*Testando Nomes válidos e inválidos*/ 
    @Test
    public void nomeCORRETO(){

        Pessoa p = new Pessoa();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("1412345677");
        p.setSexo("m");
        p.setCPF("36390745800");
        try{
            p.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void nomeConstrutor(){

        Pessoa p = new Pessoa("Anderson Felipe", "36390745800", null, "", "", "anderson@jesus.com", "1412345677", "m");
        try{
            p.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void nomeInferior(){
        Pessoa p = new Pessoa();
        p.setNome("ks");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("1412345677");
        try{
            p.validaCampos();            
        }catch(Exception e){
            assertEquals(e.getMessage(), "Nome Inválido");
        }
    }
      
    @Test
    public void nomeSuperior(){
        Pessoa p = new Pessoa();
        p.setNome("anaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");       
        p.setEmail("anderson@jesus.com");
        p.setTelefone("1412345677");        
        try{
            p.validaCampos();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Nome Inválido");
        }
    }
       
    @Test
    public void nomeCaracterEspecial(){
        Pessoa p = new Pessoa();
        p.setNome("@nderson felipe"); 
        p.setEmail("anderson@jesus.com");
        p.setTelefone("1412345677");        
        try{
            p.validaCampos();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Nome Inválido");
        }
    }
    
    
                        /*Testando Email válido e inválido*/
    @Test
    public void emailCORRETO(){
        Pessoa p = new Pessoa();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("1234567777");
        p.setSexo("m");
        p.setCPF("36390745800");
        try{
            p.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void emailPequeno(){
        Pessoa p = new Pessoa();
        p.setNome("Anderson Felipe");
        p.setEmail("@jesus.com");
        p.setTelefone("1412345677");
        try{
            p.validaCampos();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Email Inválido");
        }
  }
    
                      /*Testando telefones válidos e inválidos*/
    @Test
    public void telefoneINCORRETO(){
        Pessoa p = new Pessoa();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("00014012541254");
        p.setSexo("m");
        p.setCPF("36390745800");
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Telefone Inválido");
        }
    }
    
                    /*Testando Sexo*/
    @Test
    public void sexoM(){
        Pessoa p = new Pessoa();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("1234567777");
        p.setSexo("m");
        p.setCPF("36390745800");
        try{
            p.validaCampos();
        }catch(Exception e){
           fail(); 
        }
    }
    
    @Test
    public void sexoF(){
        Pessoa p = new Pessoa();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("1234567777");
        p.setSexo("f");
        p.setCPF("36390745800");        
        try{
            p.validaCampos();
        }catch(Exception e){
           fail(); 
        }
    }
    
    @Test
    public void sexoInvalido(){
        Pessoa p = new Pessoa();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("1234567777");
        p.setSexo("Z");
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Sexo Inválido");
        }
    }

    @Test
    public void cpfValido(){
        Pessoa p = new Pessoa();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("014012541254");
        p.setSexo("m");
        p.setCPF("36390745800");
        try{
            p.validaCampos();
        }catch(Exception e){
            fail();
        }        
    }
    
    @Test
    public void cpfInvalido(){
        Pessoa p = new Pessoa();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("014012541254");
        p.setSexo("m");
        p.setCPF("363907458");
        
        try{
            p.validaCampos();
        }catch(Exception e){
            assertEquals(e.getMessage(), "CPF Inválido");
        }
    }
    
    
    
    

}
