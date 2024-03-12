/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciopolimorheranca;

/**
 *
 * @author daviferreira
 */
public class Venda {
    private double valor;
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public double calcularTotal(Promocao desconto){
        double v = valor;
        if(desconto.estaAtiva())
           v = valor * (1 - desconto.getValorDesconto());
        return v;
    }
}
