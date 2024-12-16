/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testevenda;

/**
 *
 * @author daviferreira
 */
public class Venda {
    // Atributos
    private double totalVendido;
    private RegraDePagamento pagamento;
    
    // Construtor
    public Venda(){};
    
    // Metodos Getter e Setter
    public void setTotalVendido(double totalVendido){
        this.totalVendido = totalVendido;
    }
    
    public double getTotalVendido(){
        return this.totalVendido;
    }
    
    public void setPagamento(RegraDePagamento pagamento){
        this.pagamento = pagamento;
    }
    
    public double calcularTotal(){
        return this.pagamento.pagar(this);
    }
}
