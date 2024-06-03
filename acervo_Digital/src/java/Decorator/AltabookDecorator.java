/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author daviferreira
 */
public class AltabookDecorator extends BasePromocaoDecorator {
    
    public AltabookDecorator(IPromocao wrapped){
        super(wrapped);
    }
    
    @Override
    public Double getPrecoLivro(){
        Double valor = super.getPrecoLivro() * 0.1;
        return super.getPrecoLivro() - valor;
    }
}
