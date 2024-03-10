/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoheranca;

/**
 *
 * @author daviferreira
 */
public class Diretor extends Funcionario{
    // SubClasse
    private String unidade;
    
    public void setUnidade(String unidade){
        this.unidade = unidade;
    }
    
    public String getUnidade(){
        return this.unidade;
    }
    
    // Metodo Polimorfico
    @Override
    public double calcularBonificacao(){
        return this.getSalario() * 0.3;
    }
}
