/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicationbuilderclassic;

import java.text.SimpleDateFormat;
import java.util.Date;
import aplicationbuilderclassic.Paciente;

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
    
    public void comNome(String nome){
        this.nome = nome;
    }
    
    public void comCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void comDataNascimento(int dia, int mes, int ano){
        //Variavel do Tipo SimpleDateFormat onde recebe um modelo de data modelado pela classe SimpleDateFormat
        SimpleDateFormat variavelSDF = new SimpleDateFormat("dd/MM/yyyy");
        
        //Variavel data do tipo String que recebe os valores dos parametros e concatena com as / em String
        String data = dia + "/" + mes + "/" + ano;
        
        //Verificação de erro ou sucesso na operação
        try{
            //Pega a "variavelSDF" que contem o modelo de data desejado e converte a variavel "data" nesse modelo de data, após isso armazena a data na variavel privada.
            this.dataNascimento = variavelSDF.parse(data);
        }catch(Exception ex){
            System.out.print(ex.getMessage());
        }
     }
    
    public void comTipoSanguineo(String tipoSanguineo){
        this.tipoSanguineo = tipoSanguineo;
    }
    
    public void comDoadorDeOrgaos(boolean doadorDeOrgaos){
        this.doadorDeOrgaos = doadorDeOrgaos;
    }
    
    public void comPeso(int peso){
        this.peso = peso;
    }
    
    public void comAltura(int altura){
        this.altura = altura;
    }
    
    public void comEndereco(String rua, String bairro, int numero){
        // Metodo de armazenar os valores de endereco sem usar o construtor da classe endereco
//        Endereco variavelEndereco = new Endereco();
//        variavelEndereco.setRua(rua);
//        variavelEndereco.setBairro(bairro);
//        variavelEndereco.setNumero(numero);

          // Metodo de armazenar os valores de endereco passando os parametros via construtor
          Endereco variavelEndereco = new Endereco(rua, bairro, numero);
        
        // Verificação para ver se a operação foi bem sucedida
        try{
            this.endereco = variavelEndereco;
        }catch(Exception ex){
            System.out.print(ex.getMessage());
        }
    }
    
    public Paciente constroi(){
        return new Paciente(nome, cpf, dataNascimento, tipoSanguineo, doadorDeOrgaos, peso, altura, endereco);
    }
}
