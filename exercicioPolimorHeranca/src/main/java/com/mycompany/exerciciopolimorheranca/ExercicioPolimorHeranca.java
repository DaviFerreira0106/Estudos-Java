/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciopolimorheranca;

/**
 *
 * @author daviferreira
 */
public class ExercicioPolimorHeranca {

    public static void main(String[] args) {
        Venda v = new Venda();
        
        Promocao desconto = new PromocaoLimiteData();
        
        v.setValor(1000);
        System.out.println("Valor da Compra: "+v.getValor());
        System.out.println("Valor da Compra com Desconto: "+v.calcularTotal(desconto));
    }
}
