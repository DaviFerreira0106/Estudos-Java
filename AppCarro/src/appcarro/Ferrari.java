/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcarro;

/**
 *
 * @author daviferreira
 */
public class Ferrari extends Carro {
    // Atributos
    private boolean conversivel;
    
    // Construtor
    public Ferrari(){};
    
    // Metodos Getter e Setter
    public void setConversivel(boolean conversivel){
        this.conversivel = conversivel;
    }
    
    public boolean getConversivel(){
        return this.conversivel;
    }
    
    @Override
    public String correr(){
        return " 400 Cavalos \n 800 Km/h";
    }
}
