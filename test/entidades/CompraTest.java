/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidades.Compra;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CompraTest {
    public CompraTest() {
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
        Compra v = new Compra();
        
        v.setCod_barras("");
        
        try{
           assertFalse(v.validaCod_barras());
            
        }catch(Exception e){
            fail();
        } 
    }
    
    @Test
    public void cod_barrasMaior(){
        Compra v = new Compra();
        
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
        Compra v = new Compra();
        
        v.setCod_barras("1");
        
        try{
           assertTrue(v.validaCod_barras());
            
        }catch(Exception e){
            fail();
        } 
    }    

    @Test
    public void cod_barrasLimiteSuperior(){
        Compra v = new Compra();
        
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
    public void cnpjValido(){
        Compra v = new Compra();
        
        v.setCnpj("42195745000101");
            
        try{
            assertTrue(v.validaCnpj());
        }catch(Exception e){
            fail();
        }        
    }
    
    @Test
    public void cnpjInvalido(){
        Compra v = new Compra();
        
        v.setCnpj("5858246852354");
        
        try{
            assertFalse(v.validaCnpj());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void quantidadeValida(){
        Compra v = new Compra();
        
        v.setQtd(5874);
        
        try{
            assertTrue(v.validaQtd());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void quantidadeInvalida(){
        Compra v = new Compra();
        
        v.setQtd(-2481);
        
        try{
            assertFalse(v.validaQtd());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cnpjInvalido0(){
        Compra v = new Compra();
        
        v.setCnpj("00000000000000");
        
        try{
            assertFalse(v.validaCnpj());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cnpjInvalido1(){
        Compra v = new Compra();
        
        v.setCnpj("11111111111111");
        
        try{
            assertFalse(v.validaCnpj());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cnpjInvalido2(){
        Compra v = new Compra();
        
        v.setCnpj("22222222222222");
        
        try{
            assertFalse(v.validaCnpj());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cnpjInvalido3(){
        Compra v = new Compra();
        
        v.setCnpj("33333333333333");
        
        try{
            assertFalse(v.validaCnpj());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cnpjInvalido4(){
        Compra v = new Compra();
        
        v.setCnpj("44444444444444");
        
        try{
            assertFalse(v.validaCnpj());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cnpjInvalido5(){
        Compra v = new Compra();
        
        v.setCnpj("55555555555555");
        
        try{
            assertFalse(v.validaCnpj());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cnpjInvalido6(){
        Compra v = new Compra();
        
        v.setCnpj("66666666666666");
        
        try{
            assertFalse(v.validaCnpj());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cnpjInvalido7(){
        Compra v = new Compra();
        
        v.setCnpj("77777777777777");
        
        try{
            assertFalse(v.validaCnpj());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cnpjInvalido8(){
        Compra v = new Compra();
        
        v.setCnpj("88888888888888");
        
        try{
            assertFalse(v.validaCnpj());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void cnpjInvalido9(){
        Compra v = new Compra();
        
        v.setCnpj("99999999999999");
        
        try{
            assertFalse(v.validaCnpj());
        }catch(Exception e){
            fail();
        }
    }
    
    @Test
    public void construtor(){
        Compra v = new Compra("211157785", "42195745000101", 57457568);
        
        try{
            v.setData();
            Date d = v.getData();
            int q = v.getQtd();
        }catch(Exception e){
            fail();
        }
    }    
}
