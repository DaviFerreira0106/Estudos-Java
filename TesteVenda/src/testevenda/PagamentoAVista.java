/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testevenda;

/**
 *
 * @author daviferreira
 */
public class PagamentoAVista implements RegraDePagamento{
    @Override
    public double pagar(Venda venda){
        double total = 0;
        if(venda.getTotalVendido() > 500){
            total = venda.getTotalVendido() - (0.15 * venda.getTotalVendido());
        }else if(venda.getTotalVendido() > 300){
            total = venda.getTotalVendido() - (0.1 * venda.getTotalVendido());
        }
        
        return total;
    }
}
