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
    
    public Compra(){}
    
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

    public boolean validaCnpj(){
        Utils u = new Utils();
        return u.validaCnpj(this.getCnpj());
    }
    
    public boolean validaQtd(){
        return !(qtd < 0);
    }
}

