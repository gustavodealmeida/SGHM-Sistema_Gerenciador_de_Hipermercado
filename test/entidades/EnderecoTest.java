package entidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import entidades.Endereco;

public class EnderecoTest {
    
    public EnderecoTest() {
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

        Endereco end = new Endereco();
        end.setRua("Alberto Carazzai");
        end.setBairro("Centro");
        end.setCep("12345678");
        end.setCidade("Cornélio");
        end.setEstado("Parana");
        end.setComplemento("Nao tem");
        end.setNumero(123);
        
        try{
            end.validaCampos();
        }catch(Exception e){
            //System.out.println(e.getMessage());
            fail();
        }
    }
    
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
    }
    
    @Test
    public void ruaSuperior(){
        Endereco end = new Endereco();
        end.setRua("Alberto Carazzaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
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
    }
    
    //=========== Testes em relação a Bairro =====================
    
    @Test
    public void bairroInferior(){
        Endereco end = new Endereco();
        end.setRua("Alberto Carazzai");
        end.setBairro("Ce");
        end.setCep("12345678");
        end.setCidade("Cornélio");
        end.setEstado("Parana");
        end.setComplemento("Nao tem");
        end.setNumero(123);
        
        try{
            end.validaCampos();            
        }catch(Exception e){
            assertEquals(e.getMessage(), "Bairro Inválido");
        }
    }
    
    @Test
    public void bairroSuperior(){
        Endereco end = new Endereco();
        end.setRua("Alberto Carazzai");
        end.setBairro("Centroaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        end.setCep("12345678");
        end.setCidade("Cornélio");
        end.setEstado("Parana");
        end.setComplemento("Nao tem");
        end.setNumero(123);
        
        try{
            end.validaCampos();            
        }catch(Exception e){
            assertEquals(e.getMessage(), "Bairro Inválido");
        }
    }
    
    //=========== Testes em relação a cidade =====================
    
    @Test
    public void cidadeInferior(){
        Endereco end = new Endereco();
        end.setRua("Alberto Carazzai");
        end.setBairro("Centro");
        end.setCep("12345678");
        end.setCidade("Cor");
        end.setEstado("Parana");
        end.setComplemento("Nao tem");
        end.setNumero(123);
        
        try{
            end.validaCampos();            
        }catch(Exception e){
            assertEquals(e.getMessage(), "Cidade Inválida");
        }
    }
    
    @Test
    public void cidadeSuperior(){
        Endereco end = new Endereco();
        end.setRua("Alberto Carazzai");
        end.setBairro("Centro");
        end.setCep("12345678");
        end.setCidade("Cornélioaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        end.setEstado("Parana");
        end.setComplemento("Nao tem");
        end.setNumero(123);
        
        try{
            end.validaCampos();            
        }catch(Exception e){
            assertEquals(e.getMessage(), "Cidade Inválida");
        }
    }
    
    //=========== Testes em relação a ESTADO =====================
    
    @Test
    public void estadoInferior(){
        Endereco end = new Endereco();
        end.setRua("Alberto Carazzai");
        end.setBairro("Centro");
        end.setCep("12345678");
        end.setCidade("Cornélio");
        end.setEstado("Pa");
        end.setComplemento("Nao tem");
        end.setNumero(123);
        
        try{
            end.validaCampos();            
        }catch(Exception e){
            assertEquals(e.getMessage(), "Estado Inválido");
        }
    }
    
    @Test
    public void estadoSuperior(){
        Endereco end = new Endereco();
        end.setRua("Alberto Carazzai");
        end.setBairro("Centro");
        end.setCep("12345678");
        end.setCidade("Cornélio");
        end.setEstado("Paranaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        end.setComplemento("Nao tem");
        end.setNumero(123);
        
        try{
            end.validaCampos();            
        }catch(Exception e){
            assertEquals(e.getMessage(), "Estado Inválido");
        }
    }
    
    //=========== Testes em relação ao COMPLEMENTO =====================
    
    @Test
    public void complementoInferior(){
        Endereco end = new Endereco();
        end.setRua("Alberto Carazzai");
        end.setBairro("Centro");
        end.setCep("12345678");
        end.setCidade("Cornélio");
        end.setEstado("Parana");
        end.setComplemento("Na");
        end.setNumero(123);
        
        try{
            end.validaCampos();            
        }catch(Exception e){
            assertEquals(e.getMessage(), "Complemento Inválido");
        }
    }
    
    @Test
    public void complementoSuperior(){
        Endereco end = new Endereco();
        end.setRua("Alberto Carazzai");
        end.setBairro("Centro");
        end.setCep("12345678");
        end.setCidade("Cornélio");
        end.setEstado("Parana");
        end.setComplemento("Nao temaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        end.setNumero(123);
        
        try{
            end.validaCampos();            
        }catch(Exception e){
            assertEquals(e.getMessage(), "Complemento Inválido");
        }
    }
    
    //=========== Testes em relação ao NUMERO =====================
    
    @Test
    public void numeroInvalido(){
        Endereco end = new Endereco();
        end.setRua("Alberto Carazzai");
        end.setBairro("Centro");
        end.setCep("12345678");
        end.setCidade("Cornélio");
        end.setEstado("Parana");
        end.setComplemento("Nao tem");
        end.setNumero(-123);
        
        try{
            end.validaCampos();            
        }catch(Exception e){
            assertEquals(e.getMessage(), "Número Inválido");
        }
    }
    
    
    //=========== Testes em relação ao CEP =====================
    @Test
    public void cepInvalido(){
        Endereco end = new Endereco();
        end.setRua("Alberto Carazzai");
        end.setBairro("Centro");
        end.setCep("123");
        end.setCidade("Cornélio");
        end.setEstado("Parana");
        end.setComplemento("Nao tem");
        end.setNumero(123);
        
        try{
            end.validaCampos();            
        }catch(Exception e){
            assertEquals(e.getMessage(), "Cep Inválido");
        }
    }
    
}
