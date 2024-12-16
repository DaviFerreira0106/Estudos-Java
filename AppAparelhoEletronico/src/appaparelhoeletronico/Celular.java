/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appaparelhoeletronico;

/**
 *
 * @author daviferreira
 */
public class Celular implements AparelhoEletronico {
    @Override
    public void ligar(){
        System.out.println("Celular Ligado");
    }
    
    @Override
    public void desligar(){
        System.out.println("Celular Desligado");
    }
}
