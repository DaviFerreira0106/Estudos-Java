/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismosheranca2;

/**
 *
 * @author daviferreira
 */
public class Vendedor extends Funcionario {
    private double valorTotalVendido;
    
    public void setValorTotalVendido(double valorTotalVendido){
        this.valorTotalVendido = valorTotalVendido;
    }
    
    public double getValorTotalVendido(){
        return this.valorTotalVendido;
    }
    
    @Override
    public double calcularBonificacao(){
        double bonificacao;
        if(this.valorTotalVendido < 500){
           bonificacao = this.getSalario() * 0.5;
        }else if(this.valorTotalVendido < 1500){
           bonificacao = this.getSalario() * 0.15;
        }else if(this.valorTotalVendido < 2500){
            bonificacao = this.getSalario() * 0.5;
        }else {
            bonificacao = this.getSalario() * 0.8;
        }
        
        return bonificacao;
    }
}
