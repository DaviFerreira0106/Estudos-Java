/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcarro;

/**
 *
 * @author daviferreira
 */
public class Mercedes extends Carro {
    // Atributos
    private String cor;
    
    // Construtor
    public Mercedes(){};
    
    // Metodos Getter e Setter
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    // Metodo
    @Override
    public String correr(){
        return " 500 Cavalos \n 900 Km/h";
    }
}
