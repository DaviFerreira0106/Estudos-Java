/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismoheranca;

/**
 *
 * @author daviferreira
 */
public class PolimorfismoHeranca {

    public static void main(String[] args) {
        
        Funcionario objeto = new Diretor();
        
        objeto.setNome("Davi");
        objeto.setCpf("4444444444444");
        objeto.setSalario(1000);
        
        System.out.println("Nome: "+objeto.getNome());
        System.out.println("CPF: "+objeto.getCpf());
        System.out.println("Salario: "+objeto.getSalario());
        System.out.println("Bonificação: "+objeto.calcularBonificacao());
    }
}
