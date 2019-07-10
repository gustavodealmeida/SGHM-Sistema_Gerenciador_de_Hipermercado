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

import entidades.Fornecedor;

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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void fornecedorCorreto(){
        Fornecedor f = new Fornecedor("UTFPR", "13643624000179", "12345678", "email@email.com", 1);
        
        try{
            f.validaCampos();
        }catch(Exception e){
            fail();
        }
    }
    
    //========== Validando NOME =================
    @Test
    public void nomeInferior(){
        Fornecedor f = new Fornecedor();
        f.setNome("UT");
        f.setCNPJ("13643624000179");
        f.setTelefone("12345678");
        f.setEmail("email@email.com");
        
        try{
            f.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Nome Inválido");
        }
    }
    
    @Test
    public void nomeSuperior(){
        Fornecedor f = new Fornecedor();
        f.setNome("UTFPRaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        f.setCNPJ("13643624000179");
        f.setTelefone("12345678");
        f.setEmail("email@email.com");
        
        try{
            f.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Nome Inválido");
        }
    }
    
    
    //============ CNPJ =====================
    @Test
    public void cnpjInvalido(){
        Fornecedor f = new Fornecedor();
        f.setNome("UTFPR");
        f.setCNPJ("13643624000171");
        f.setTelefone("12345678");
        f.setEmail("email@email.com");
        
        try{
            f.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "CNPJ Inválido");
        }
    }
    
    @Test
    public void imprimirCNPJ(){
        assertEquals(Fornecedor.imprimeCNPJ("13643624000179"), "13.643.624.0001-79");    
    }
    
    //============ EMAIL =====================
    @Test
    public void emailInvalido(){
        Fornecedor f = new Fornecedor();
        f.setNome("UTFPR");
        f.setCNPJ("13643624000179");
        f.setTelefone("12345678");
        f.setEmail("emailemail.com");
        
        try{
            f.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Email Inválido");
        }
    }
    
    //============ TELEFONE =====================
    @Test
    public void telefoneInvalido(){
        Fornecedor f = new Fornecedor();
        f.setNome("UTFPR");
        f.setCNPJ("13643624000179");
        f.setTelefone("1234567");
        f.setEmail("email@email.com");
        
        try{
            f.validaCampos();
            fail();
        }catch(Exception e){
            assertEquals(e.getMessage(), "Telefone Inválido");
        }
    }
}
