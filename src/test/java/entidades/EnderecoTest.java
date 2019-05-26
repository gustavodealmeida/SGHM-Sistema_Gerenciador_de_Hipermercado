package entidades;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.utfpr.sghm.entidades.Endereco;
import com.utfpr.sghm.controller.EnderecoController;

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
    public void insercaoEndereco() {
        Endereco end = new Endereco();
        end.setRua("Teste2");
        end.setNumero(12);
        end.setBairro("Dois");
        end.setCidade("Cornelio");
        end.setEstado("Parana");
        end.setCep("1232435");
        end.setComplemento("Não tem");
        
        
        try{
            new EnderecoController().create(end);
        }catch (Exception e){
            fail();
        }
    }
    
    @Test
    public void consultaEndereco() {
        try{
            Endereco end  = new EnderecoController().consultaPorID(1);
            
            System.out.println("\n\n"+ end.getRua());
            System.out.println(end.getNumero());
            System.out.println(end.getBairro());
            System.out.println(end.getComplemento());
            System.out.println(end.getCidade());
            System.out.println(end.getEstado());
            System.out.println(end.getCep()+"\n\n");
            
        }catch (Exception e){
            fail();
        }
    }
    
    //@Test
    public void remocaoEndereco() {    
        try{
            new EnderecoController().delete(2);
        }catch (Exception e){
            fail();
        }
    }
}
