/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appcarro;

/**
 *
 * @author daviferreira
 */
public class AppCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mercedes objCarro = new Mercedes();
        
        objCarro.setCapacidade(4);
        objCarro.setModelo("cla 200");
        objCarro.setPlaca("xxxxxx11111");
        objCarro.setQtdPortas(2);
        objCarro.setCor("Prata");
        
        System.out.println("Capacidade.................: "+objCarro.getCapacidade());
        System.out.println("Modelo.....................: "+objCarro.getModelo());
        System.out.println("Placa......................: "+objCarro.getPlaca());
        System.out.println("Quantidade de Portas.......: "+objCarro.getQtdPortas());
        System.out.println("Cor........................: "+objCarro.getCor());
        System.out.println("Motor Mercedes.............: \n"+objCarro.correr());
        
        Carro obj = new Ferrari();
        
        System.out.println("Motor Ferrari..............: \n"+obj.correr());
        
        obj = new Jaguar();
        
        System.out.println("Motor Jaguar...............: \n"+obj.correr());
    }
    
}
