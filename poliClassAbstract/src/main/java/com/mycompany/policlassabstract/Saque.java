/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.policlassabstract;

/**
 *
 * @author daviferreira
 */
public class Saque extends Transacao {
    private Conta conta;
    
    public Saque(){};
    
    @Override
    public void realizarTransacao(){
        double saldo = conta.getSaldo() - getValor();
        conta.setSaldo(saldo);
        
        System.out.println("Saque realizado em "+getData());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Valor de saque: R$"+getValor());
        System.out.println("Saldo: R$"+conta.getSaldo());
    }
}
