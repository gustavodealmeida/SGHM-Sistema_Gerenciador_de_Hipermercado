/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidades.Fornecedor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author prado
 */
public class FornecedorTest {
    public FornecedorTest() {
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

        Fornecedor p = new Fornecedor();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("1412345677");
        p.setCNPJ("68475195000160");
        try{
            p.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void nomeConstrutor(){

        Fornecedor p = new Fornecedor("Anderson Felipe", "68475195000160", "1412345677", "anderson@jesus.com", 50);
        try{
            p.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void nomeInferior(){
        Fornecedor p = new Fornecedor();
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
        Fornecedor p = new Fornecedor();
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
        Fornecedor p = new Fornecedor();
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
        Fornecedor p = new Fornecedor();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("1234567777");
        p.setCNPJ("68475195000160");
        try{
            p.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void emailPequeno(){
        Fornecedor p = new Fornecedor();
        p.setNome("Anderson Felipe");
        p.setEmail("@jesus.com");
        p.setTelefone("1234567777");
        p.setCNPJ("68475195000160");
        try{
            p.validaCampos();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Email Inválido");
        }
  }
    
                      /*Testando telefones válidos e inválidos*/
    @Test
    public void telefoneINCORRETO(){
        Fornecedor p = new Fornecedor();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("00014012541254");
        p.setCNPJ("68475195000160");
        try{
            p.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Telefone Inválido");
        }
    }
    
    @Test
    public void telefoneCorreto1(){
        Fornecedor p = new Fornecedor();
        
        p.setTelefone("91234567");
        
        try{
            assertTrue(p.validaTelefone());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void telefoneCorreto2(){
        Fornecedor p = new Fornecedor();
        
        p.setTelefone("9123456789");
        
        try{
            assertTrue(p.validaTelefone());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void telefoneCorreto3(){
        Fornecedor p = new Fornecedor();
        
        p.setTelefone("912345678999");
        
        try{
            assertTrue(p.validaTelefone());
        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void cnpjValido(){
        Fornecedor p = new Fornecedor();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("014012541254");
        p.setCNPJ("68475195000160");
        try{
            p.validaCampos();
        }catch(Exception e){
            fail();
        }        
    }
    
    @Test
    public void cnpjInvalido(){
        Fornecedor p = new Fornecedor();
        p.setNome("Anderson Felipe");
        p.setEmail("anderson@jesus.com");
        p.setTelefone("014012541254");
        p.setCNPJ("68475670160");
        
        try{
            p.validaCampos();
        }catch(Exception e){
            assertEquals(e.getMessage(), "CNPJ Inválido");
        }
    }
    
    @Test
    public void construtor(){
        Fornecedor p = new Fornecedor();
        
        int i = 52;

        p.setEnd_id(i);
       
        
        try{
            assertEquals(p.getEnd_id(), 52);
        }catch(Exception e){
            fail();
        }
    }
    
 

}
