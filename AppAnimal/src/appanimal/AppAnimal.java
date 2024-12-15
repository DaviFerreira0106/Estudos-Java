/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appanimal;

/**
 *
 * @author daviferreira
 */
public class AppAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal obj = new Leao();
        
        obj.setAudicao("até 1Km de distancia");
        obj.setOlfato("Até 2Km de distancia");
        obj.setQtdPatas("quatro patas");
        
        System.out.println("Audição...............: "+obj.getAudicao());
        System.out.println("Olfato................: "+obj.getOlfato());
        System.out.println("Quantidade de Patas...: "+obj.getQtdPatas());
        obj.acao();
        
        obj = new Baleia();
        
        obj.acao();
        
        obj = new Macaco();
        
        obj.acao();
    }
    
}
