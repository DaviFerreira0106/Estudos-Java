/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Decorator;

/**
 *
 * @author daviferreira
 */
public class BasePromocaoDecorator implements IPromocao{
    
    private final IPromocao wrapped;
    
    public BasePromocaoDecorator(IPromocao wrapped){
        this.wrapped = wrapped;
    }
    
    @Override
    public Double getPrecoLivro(){
        return wrapped.getPrecoLivro();
    }
}
