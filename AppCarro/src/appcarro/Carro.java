/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcarro;

/**
 *
 * @author daviferreira
 */
public class Carro {
    // Atributos
    private String placa;
    private int qtdPortas;
    private int capacidade;
    private String modelo;
    
    // Construtor
    public Carro(){};
    
    // Metodos Getter e Setter
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getPlaca(){
        return this.placa;
    }
    
    public void setQtdPortas(int qtdPostas){
        this.qtdPortas = qtdPortas;
    }
    
    public int getQtdPortas(){
        return this.qtdPortas;
    }
    
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    
    public int getCapacidade(){
        return this.capacidade;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    // Metodo
    public String correr(){
        return " 80 Cavalos \n 200 Km/h";
    }
}
