/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appaparelhoeletronico;

/**
 *
 * @author daviferreira
 */
public class AppAparelhoEletronico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AparelhoEletronico obj = new Celular();
        
        obj.ligar();
        obj.desligar();
        
        obj = new TV();
        
        obj.ligar();
        obj.desligar();
    }
    
}
