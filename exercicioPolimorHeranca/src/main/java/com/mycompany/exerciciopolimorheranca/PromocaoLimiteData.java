/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciopolimorheranca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daviferreira
 */
public class PromocaoLimiteData extends Promocao{
    private Date dataLimite;
    
    public void setDataLimite(Date dataLimite){
        this.dataLimite = dataLimite;
    }
    
    public Date getDataLimite(){
        return this.dataLimite;
    }
    
    @Override
    public boolean estaAtiva(){
        try {
            dataLimite = new SimpleDateFormat("dd/MM/yyyy").parse("15/03/2024");
        } catch (ParseException ex) {
            Logger.getLogger(PromocaoLimiteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Date hoje = new Date();
        if(dataLimite.after(hoje)){
            return true;
        }else {
            return false;
        }
    }
    
    @Override
    public double getValorDesconto(){
        if(estaAtiva()){
            valorDesconto = 0.1;
        }
        return valorDesconto;
    }
}
