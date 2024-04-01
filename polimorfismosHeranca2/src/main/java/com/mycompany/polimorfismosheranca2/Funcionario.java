/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismosheranca2;

import java.util.Date;

/**
 *
 * @author daviferreira
 * 
 * Classe Anemica
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private double salario;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setDataNascimento(Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public Date getDataNascimento(){
        return this.dataNascimento;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public double calcularBonificacao(){
        return salario * 0.05;
    }
}
