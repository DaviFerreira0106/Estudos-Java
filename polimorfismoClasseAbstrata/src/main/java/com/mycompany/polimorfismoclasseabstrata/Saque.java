/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoclasseabstrata;

/**
 *
 * @author daviferreira
 * SubClasse 
 */
public class Saque extends Transacao{
    
    //Implemetação do metodo Abstrato
    @Override
    public void registrarTransacao(){
        System.out.println("Saque realizado em: " + getData());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor R$: " + getValor());
    }
}
