/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author daviferreira
 */
public class RoccoDecorator extends BasePromocaoDecorator{
    
    public RoccoDecorator(IPromocao wrapped){
        super(wrapped);
    }
    
    @Override
    public Double getPrecoLivro(){
        Double valor = super.getPrecoLivro() * 0.2;
        return super.getPrecoLivro() - valor;
    }
}
