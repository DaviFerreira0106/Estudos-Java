/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoheranca;

/**
 *
 * @author daviferreira
 */
public class Gerente extends Funcionario {
    // SubClasse
    private String setor;
    
    public void setSetor(String setor){
        this.setor = setor;
    }
    
    public String getSetor(){
        return this.setor;
    }
    
    // Metodo Polimorfico
    @Override
    public double calcularBonificacao(){
        return this.getSalario() * 0.2;
    }
}
