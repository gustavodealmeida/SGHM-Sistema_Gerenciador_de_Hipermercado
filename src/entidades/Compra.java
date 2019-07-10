/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.InputMismatchException;

/**
 *
 * @author prado
 */
public class Compra {
    private String cod_barras;
    private String cnpj;
    private int qtd;
    private Date data;
    
    public Compra(String cod_barras, String cnpj, int qtd){
        this.setCod_barras(cod_barras);
        this.setCnpj(cnpj);
        this.setQtd(qtd);
        this.setData();
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setData() {
        this.data = new Date();
    }

    public String getCod_barras() {
        return this.cod_barras;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public int getQtd() {
        return this.qtd;
    }

    public Date getData() {
        return this.data;
    }
    
    public boolean validaCod_barras(){
        return !(this.getCod_barras().length() > 50 || this.getCod_barras().length() < 1);    
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
    
    public boolean validaQtd(){
        return !(qtd < 0);
    }
    
    public boolean validaCnpj(String CNPJ){
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
            CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
            CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
            CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
            CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
            CNPJ.length() != 14)
            return(false);

        char dig13, dig14;
        int sm, i, r, num, peso;

        try {

            sm = 0;
            peso = 2;
            for (i=11; i>=0; i--) {
                num = (int)(CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            
            if ((r == 0) || (r == 1))
                dig13 = '0';
            
            else dig13 = (char)((11-r) + 48);

            sm = 0;
            peso = 2;
            
            for (i=12; i>=0; i--) {
                num = (int)(CNPJ.charAt(i)- 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            
            if ((r == 0) || (r == 1))
                dig14 = '0';
            
            else dig14 = (char)((11-r) + 48);

            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
                return(true);
            
            else return(false);
        
        } catch (InputMismatchException erro) {
            return(false);
        }
    }  
}

