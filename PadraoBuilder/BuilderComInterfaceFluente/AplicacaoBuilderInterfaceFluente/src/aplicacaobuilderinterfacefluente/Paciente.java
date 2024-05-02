/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaobuilderinterfacefluente;

import java.util.Date;

/**
 *
 * @author daviferreira
 */

//Classe Anemica
public class Paciente {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String tipoSanguineo;
    private boolean doadorDeOrgaos;
    private int peso;
    private int altura;
    private Endereco endereco;
    
    public Paciente(String nome, String cpf, Date dataNascimento, String tipoSanguineo, boolean doadorDeOrgaos, int peso, int altura, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.tipoSanguineo = tipoSanguineo;
        this.doadorDeOrgaos = doadorDeOrgaos;
        this.peso = peso;
        this.altura = altura;
        this.endereco = endereco;
    }
    
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
    
    public void setTipoSanguineo(String tipoSanguineo){
        this.tipoSanguineo = tipoSanguineo;
    }
    
    public String getTipoSanguineo(){
        return this.tipoSanguineo;
    }
    
    public void setDoadorDeOrgaos(boolean doadorDeOrgaos){
        this.doadorDeOrgaos = doadorDeOrgaos;
    }
    
    public boolean getDoadorDeOrgaos(){
        return this.doadorDeOrgaos;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public int getPeso(){
        return this.peso;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public int getAltura(){
        return this.altura;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Endereco getEndereco(){
        return this.endereco;
    }
}
