/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testevenda;

/**
 *
 * @author daviferreira
 */
public class PagamentoAPrazo implements RegraDePagamento {
    @Override
    public double pagar(Venda venda){
        double total = 0;
        total = venda.getTotalVendido() + (0.08 * venda.getTotalVendido());
        return total;
    }
}
