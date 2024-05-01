/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicationbuilderclassic;

/**
 *
 * @author daviferreira
 */

// Classe Anemica

public class Endereco {
    private String rua;
    private String bairro;
    private int numero;
    
    public Endereco(String rua, String bairro, int numero){
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public String getRua(){
        return this.rua;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return this.numero;
    }
}
