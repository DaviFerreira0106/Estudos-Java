/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.policlassabstract;

import java.text.ParseException;

/**
 *
 * @author daviferreira
 */
public class PoliClassAbstract {

    public static void main(String[] args) throws ParseException {
        Conta objConta = new Conta(1234);
        
        Transacao objPoli = new Deposito();
        
        objPoli.setData(8, 12, 2024);
        objPoli.setDescricao("Deposito - Salário");
        objPoli.setValor(1500);
        
        objConta.novaTransacao(objPoli);
        
        objPoli = new Saque();
        
        objPoli.setData(9, 12, 2024);
        objPoli.setDescricao("Pagamento de conta");
        objPoli.setValor(500);
        
        objConta.novaTransacao(objPoli);
    }
}
