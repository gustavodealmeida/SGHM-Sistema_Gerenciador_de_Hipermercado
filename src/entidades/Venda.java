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
        return validaCPF(this.getFunc_cpf());
    }

    public boolean validaCliente_Cpf(){
        return validaCPF(this.getCliente_cpf());
    }
    
    public boolean validaData(){
        Date data = this.getData();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate d = LocalDate.parse((CharSequence)data, formatter);
            return true;
        }catch (DateTimeParseException e) {
            return false;
      }   
   }    
    
    public boolean validaCPF(String CPF){
        if (CPF.equals("00000000000") ||
	        CPF.equals("11111111111") ||
	        CPF.equals("22222222222") || CPF.equals("33333333333") ||
	        CPF.equals("44444444444") || CPF.equals("55555555555") ||
	        CPF.equals("66666666666") || CPF.equals("77777777777") ||
	        CPF.equals("88888888888") || CPF.equals("99999999999") ||
	        (CPF.length() != 11))
            return(false);
        char dig10, dig11;
        int sm, i, r, num, peso;
        try {
            sm = 0;
            peso = 10;
            for (i=0; i<9; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            }else {
                dig10 = (char)(r + 48);
            }
            sm = 0;
            peso = 11;
            for(i=0; i<10; i++) {
                num = (int)(CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }
            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char)(r + 48);
            }
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
                return(true);
            } else {
                return(false);
            }
        }catch (InputMismatchException erro) {
            return(false);
        }
    }
    
    
    
}
