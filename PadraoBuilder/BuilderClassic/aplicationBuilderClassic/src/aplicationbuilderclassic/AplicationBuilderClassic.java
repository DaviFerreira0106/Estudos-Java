/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicationbuilderclassic;

import java.text.SimpleDateFormat;

/**
 *
 * @author daviferreira
 */
public class AplicationBuilderClassic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Objeto builder
        PacienteBuilder objBuilder = new PacienteBuilder();
        objBuilder.comNome("Davi");
        objBuilder.comCpf("1234567875");
        objBuilder.comAltura(175);
        objBuilder.comDataNascimento(1, 6, 2002);
        objBuilder.comEndereco("Rua Albert Fink", "Parque Maria Helena", 1006);
        objBuilder.comPeso(68);
        objBuilder.comTipoSanguineo("A+");
        
        Paciente objPaciente = objBuilder.constroi();
        
        System.out.println("Nome....................: " + objPaciente.getNome());
        System.out.println("CPF.....................: " + objPaciente.getCpf());
        System.out.println("Data de Nascimento......: " + new SimpleDateFormat("dd/MM/yyyy").format(objPaciente.getDataNascimento())); // Converte a data do objeto
        System.out.println("Altura..................: " + objPaciente.getAltura());
        System.out.println("Endereço: ");
        System.out.println("    Rua.......: " + objPaciente.getEndereco().getRua());
        System.out.println("    Bairro....: " + objPaciente.getEndereco().getBairro());
        System.out.println("    Número....: " + objPaciente.getEndereco().getNumero());
        System.out.println("Peso....................: " + objPaciente.getPeso());
        System.out.println("Tipo Sanguineo..........: " + objPaciente.getTipoSanguineo());
        
    }
    
}
