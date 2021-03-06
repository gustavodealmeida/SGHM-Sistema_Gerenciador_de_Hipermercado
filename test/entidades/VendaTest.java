/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidades.Venda;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class VendaTest {
    public VendaTest() {
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
    public void cod_barrasMenor(){
        Venda v = new Venda();
        
        v.setCod_barras("");
        
        try{
           assertFalse(v.validaCod_barras());
            
        }catch(Exception e){
            fail();
        } 
    }
    
    @Test
    public void cod_barrasMaior(){
        Venda v = new Venda();
        
        v.setCod_barras("11111111111111111111" +
                        "11111111111111111111" +
                        "11111111111111111111");
        
        try{
           assertFalse(v.validaCod_barras());
            
        }catch(Exception e){
            fail();
        } 
    }  
    
    @Test
    public void cod_barrasLimiteInferior(){
        Venda v = new Venda();
        
        v.setCod_barras("1");
        
        try{
           assertTrue(v.validaCod_barras());
            
        }catch(Exception e){
            fail();
        } 
    }    

    @Test
    public void cod_barrasLimiteSuperior(){
        Venda v = new Venda();
        
        v.setCod_barras("11111111111111111" +
                        "11111111111111111" +
                        "1111111111111111");
        
        try{
           assertTrue(v.validaCod_barras());
            
        }catch(Exception e){
            fail();
        } 
    }
    
    @Test
    public void func_cpfValido(){
        Venda v = new Venda();
        
        v.setFunc_cpf("08530549910");
            
        try{
            assertTrue(v.validaFunc_Cpf());
        }catch(Exception e){
            fail();
        }        
    }
    
    @Test
    public void func_cpfInvalido(){
        Venda v = new Venda();
        
        v.setFunc_cpf("58582468524");
        
        try{
            assertFalse(v.validaFunc_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    @Test
    public void cliente_cpfValido(){
        Venda v = new Venda();
        
        v.setCliente_cpf("08530549910");
            
        try{
            assertTrue(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }        
    }
    
    @Test
    public void cliente_cpfInvalido(){
        Venda v = new Venda();
        
        v.setCliente_cpf("58582468524");
        
        try{
            assertFalse(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cpfValido(){
        Venda v = new Venda();
        
        v.setCliente_cpf("33062953020");
        
        try{
            assertTrue(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cpfInvalido0(){
        Venda v = new Venda();
        
        v.setCliente_cpf("00000000000");
        
        try{
            assertFalse(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cpfInvalido1(){
        Venda v = new Venda();
        
        v.setCliente_cpf("11111111111");
        
        try{
            assertFalse(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cpfInvalido2(){
        Venda v = new Venda();
        
        v.setCliente_cpf("22222222222");
        
        try{
            assertFalse(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cpfInvalido3(){
        Venda v = new Venda();
        
        v.setCliente_cpf("33333333333");
        
        try{
            assertFalse(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cpfInvalido4(){
        Venda v = new Venda();
        
        v.setCliente_cpf("44444444444");
        
        try{
            assertFalse(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cpfInvalido5(){
        Venda v = new Venda();
        
        v.setCliente_cpf("55555555555");
        
        try{
            assertFalse(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cpfInvalido6(){
        Venda v = new Venda();
        
        v.setCliente_cpf("66666666666");
        
        try{
            assertFalse(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cpfInvalido7(){
        Venda v = new Venda();
        
        v.setCliente_cpf("77777777777");
        
        try{
            assertFalse(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cpfInvalido8(){
        Venda v = new Venda();
        
        v.setCliente_cpf("88888888888");
        
        try{
            assertFalse(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cpfInvalido9(){
        Venda v = new Venda();
        
        v.setCliente_cpf("99999999999");
        
        try{
            assertFalse(v.validaCliente_Cpf());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void construtor(){
        Venda v = new Venda("211157785", "08530549910", "39315343085");
        
        try{
            v.setData();
            Date d = v.getData();
        }catch(Exception e){
            fail();
        }
    }
}
