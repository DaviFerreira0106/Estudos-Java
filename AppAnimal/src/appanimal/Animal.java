/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appanimal;

/**
 *
 * @author daviferreira
 */
public abstract class Animal {
    // Atributo
    private String qtdPatas;
    private String olfato;
    private String audicao;
    
    // Construtor
    public Animal(){};
    
    // Metodos Getter e Setter
    public void setQtdPatas(String qtdPatas){
        this.qtdPatas = qtdPatas;
    }
    
    public String getQtdPatas(){
        return this.qtdPatas;
    }
    
    public void setOlfato(String olfato){
        this.olfato = olfato;
    }
    
    public String getOlfato(){
        return this.olfato;
    }
    
    public void setAudicao(String audicao){
        this.audicao = audicao;
    }
    
    public String getAudicao(){
        return this.audicao;
    }
    
    // Metodo
    public abstract void acao();
}
