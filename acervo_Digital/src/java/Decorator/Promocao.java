/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author daviferreira
 */
public class Promocao implements IPromocao{
    private Double preco;
    
    public Promocao(Double preco){
        this.preco = preco;
    }
    
    public void setPrecoLivro(Double preco){
        this.preco = preco;
    }
    
    @Override
    public Double getPrecoLivro(){
        return this.preco;
    }
}
