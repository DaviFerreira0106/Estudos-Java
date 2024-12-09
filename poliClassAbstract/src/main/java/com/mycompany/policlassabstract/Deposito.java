/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.policlassabstract;

/**
 *
 * @author daviferreira
 */
public class Deposito extends Transacao {
    private Conta conta;
    
    public Deposito(){};
    
    @Override
    public void realizarTransacao(){
        double saldo = conta.getSaldo() + getValor();
        conta.setSaldo(saldo);
        
        System.out.println("Deposito realizado em "+getData());
        System.out.println("Descrição: "+getDescricao());
        System.out.println("Valor do deposito: R$"+getValor());
        System.out.println("Saldo: R$"+conta.getSaldo());
    }
}
