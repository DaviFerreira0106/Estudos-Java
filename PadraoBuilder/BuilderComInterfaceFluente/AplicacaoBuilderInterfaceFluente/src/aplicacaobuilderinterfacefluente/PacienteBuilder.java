/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacaobuilderinterfacefluente;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author daviferreira
 */
public class PacienteBuilder {
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String tipoSanguineo;
    private boolean doadorDeOrgaos;
    private int peso;
    private int altura;
    private Endereco endereco;
    
    public PacienteBuilder(){}
    
    public PacienteBuilder comNome(String nome){
        this.nome = nome;
        return this; // Retirna a classe pelo metodo ter o retorno do tipo PacienteBuilder
    }
    
    public PacienteBuilder comCpf(String cpf){
        this.cpf = cpf;
        return this;
    }
    
    public PacienteBuilder comDataNascimento(int dia, int mes, int ano){
        
        // Criação de variavel para receber modelo de data
        SimpleDateFormat varDataSDF = new SimpleDateFormat("dd/MM/yyyy");
        
        // Criação de variavel que armazena a data recebida por parametro
        String data = dia + "/" + mes + "/" + ano;
        
        // Verifica se a operação será realizada com sucesso
        try{
           this.dataNascimento = varDataSDF.parse(data);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return this;
    }
    
    public PacienteBuilder comTipoSanguineo(String tipoSanguineo){
        this.tipoSanguineo = tipoSanguineo;
        return this;
    }
    
    public PacienteBuilder comDoadorDeOrgaos(boolean doadorDeOrgaos){
        this.doadorDeOrgaos = doadorDeOrgaos;
        return this;
    }
    
    public PacienteBuilder comPeso(int peso){
        this.peso = peso;
        return this;
    }
    
    public PacienteBuilder comAltura(int altura){
        this.altura = altura;
        return this;
    }
    
    public PacienteBuilder comEndereco(String rua, String bairro, int numero){
        
        // Criação de Variavel para armazenar os atributos passados via parametros para o construtor
        Endereco varEndereco = new Endereco(rua, bairro, numero);
        
        try{
            this.endereco = varEndereco;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return this;
    }
    
    public Paciente constroi(){
        return new Paciente(nome, cpf, dataNascimento, tipoSanguineo, doadorDeOrgaos, peso, altura, endereco);
    }
}
