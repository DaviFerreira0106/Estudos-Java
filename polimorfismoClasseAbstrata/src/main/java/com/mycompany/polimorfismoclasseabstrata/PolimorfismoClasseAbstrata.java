/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismoclasseabstrata;

import java.util.Date;

/**
 *
 * @author daviferreira
 */
public class PolimorfismoClasseAbstrata {

    public static void main(String[] args) {
        Conta obj = new Conta(12004, 500);
        
        Saque objSaque = new Saque();
        
        objSaque.setData(new Date());
        objSaque.setDescricao("Pagamento de Conta");
        objSaque.setValor(50.5);
        
        obj.novaTransacao(objSaque);
    }
}
