/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testevenda;

/**
 *
 * @author daviferreira
 */
public class TesteVenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Venda objVenda = new Venda();
        
        objVenda.setTotalVendido(350);
        
        RegraDePagamento objPag = new PagamentoAPrazo();
        
        objVenda.setPagamento(objPag);
        
        System.out.println(objVenda.calcularTotal());
    }
    
}
