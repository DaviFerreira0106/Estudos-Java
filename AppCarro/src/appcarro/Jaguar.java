/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcarro;

/**
 *
 * @author daviferreira
 */
public class Jaguar extends Carro {
    // Atributos
    private boolean esportivo;
    
    // Construtor
    public Jaguar(){};
    
    // Metodo Getter e Setter
    public void setEsportivo(boolean esportivo){
        this.esportivo = esportivo;
    }
    
    public boolean getEsportivo(){
        return this.esportivo;
    }
    
    @Override
    public String correr(){
        return " 400 Cavalos \n 750 km/h";
    }
}
