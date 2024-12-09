/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.policlassabstract;
/**
 *
 * @author daviferreira
 */
import java.util.ArrayList;

public class Conta {
    private long numero;
    private double saldo;
    private ArrayList<Transacao> transacoes = new ArrayList<Transacao>();
    
    public Conta(long numero){
        this.numero = numero;
        System.out.println("Número: "+this.numero+" Saldo R$: "+this.saldo);
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void novaTransacao(Transacao transacao){
        transacoes.add(transacao);
        transacao.realizarTransacao();
    }
}
