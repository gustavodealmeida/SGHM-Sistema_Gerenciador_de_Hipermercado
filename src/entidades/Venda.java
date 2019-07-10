package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.InputMismatchException;

public class Venda {
    private String cod_barras;
    private String func_cpf;
    private String cliente_cpf;
    private Date data;
    
    public Venda(String cod_barras, String func_cpf, String cliente_cpf){
        this.setCod_barras(cod_barras);
        this.setFunc_cpf(func_cpf);
        this.setCliente_cpf(cliente_cpf);
        this.setData();
    }

    public Venda() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public void setFunc_cpf(String func_cpf) {
        this.func_cpf = func_cpf;
    }

    public void setCliente_cpf(String cliente_cpf) {
        this.cliente_cpf = cliente_cpf;
    }

    public void setData() {
        this.data = new Date();
    }

    public String getCod_barras() {
        return this.cod_barras;
    }

    public String getFunc_cpf() {
        return this.func_cpf;
    }

    public String getCliente_cpf() {
        return this.cliente_cpf;
    }

    public Date getData() {
        return this.data;
    }
    
    public boolean validaCod_barras(){
        return !(this.getCod_barras().length() > 50 || this.getCod_barras().length() < 1);    
    }
    
    public boolean validaFunc_Cpf(){
        Utils u = new Utils();
        return u.validaCPF(this.getFunc_cpf());
    }

    public boolean validaCliente_Cpf(){
        Utils u = new Utils();
        return u.validaCPF(this.getCliente_cpf());
    }
}
