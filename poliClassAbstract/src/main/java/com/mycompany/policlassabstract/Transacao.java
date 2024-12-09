/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.policlassabstract;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author daviferreira
 */
public abstract class Transacao {
    private Date data;
    private double valor;
    private String descricao;
    
    public Transacao(){};
    
    public void setData(int dia, int mes, int ano) throws ParseException{
        String d = Integer.toString(dia);
        String m = Integer.toString(mes);
        String a = Integer.toString(ano);
        
        String data = ""+d+"/"+m+"/"+a;
        
        this.data = new SimpleDateFormat("dd/MM/yyyy").parse(data);
    }
    
    public Date getData(){
        return this.data;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public abstract void realizarTransacao();
}
