/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoclasseabstrata;

import java.util.Date;

/**
 *
 * @author daviferreira
 * SuperClasse abstrata
 */

public abstract class Transacao {
    private Date data;
    private double valor;
    private String descricao;
    
    //Metodo Abstrato
    public abstract void registrarTransacao();
    
    @Override
    public String toString(){
        return "Transação [data: " + this.data + ", valor: " + this.valor + ", descrição: " + this.descricao + "]";
    }
    
    public void setData(Date data){
        this.data = data;
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
}
