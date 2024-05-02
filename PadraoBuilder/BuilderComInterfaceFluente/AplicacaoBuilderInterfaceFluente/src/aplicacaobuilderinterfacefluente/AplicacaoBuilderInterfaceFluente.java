/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacaobuilderinterfacefluente;

import java.text.SimpleDateFormat;

/**
 *
 * @author daviferreira
 */
public class AplicacaoBuilderInterfaceFluente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Criação de Objeto do tipo Paciente para recebimento do metodo constroi (que retorna um construtor)
        Paciente objPaciente = new PacienteBuilder()
                .comNome("Laura")
                .comAltura(168)
                .comCpf("123454321")
                .comDataNascimento(13, 12, 2003)
                .comEndereco("Rua Alcides", "Jardim Azul", 155)
                .comPeso(59)
                .constroi();
                
        //Exibindo valores armazenados
        System.out.println("Nome....................: " + objPaciente.getNome());
        System.out.println("CPF.....................: " + objPaciente.getCpf());
        System.out.println("Data de Nascimento......: " + new SimpleDateFormat("dd/MM/yyyy").format(objPaciente.getDataNascimento())); // Converte data de nascimento
        System.out.println("Altura..................: " + objPaciente.getAltura());
        System.out.println("Endereço: ");
        System.out.println("    Rua.................: " + objPaciente.getEndereco().getRua());
        System.out.println("    Número..............: " + objPaciente.getEndereco().getNumero());
        System.out.println("    Bairro..............: " + objPaciente.getEndereco().getBairro());
        System.out.println("Peso....................: " + objPaciente.getPeso());
    }
    
}
