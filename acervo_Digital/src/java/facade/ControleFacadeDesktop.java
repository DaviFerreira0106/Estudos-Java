package facade;

import DAO.LivroDAO;
import Model.Livro;
import java.sql.SQLException;

public class ControleFacadeDesktop {

    public String acionarCadastrar(Livro liv) {

        LivroDAO livdao = new LivroDAO();
        String message = "";
        try {
            livdao.cadastrar(liv);
            message = "CADASTRADO COM SUCESSO";
        } catch (ClassNotFoundException | SQLException ex) {
            message = "CADASTRO NÃO REALIZADO: " + ex.getMessage();
            System.out.println("Erro: " + ex.getMessage());
        }
        return message;
    }

    public String acionarAtualizar(Livro liv) {

        LivroDAO livdao = new LivroDAO();
        String message = "";
        try {
            livdao.atualizar(liv);
            message = "ATUALIZADO COM SUCESSO";
        } catch (ClassNotFoundException | SQLException ex) {
            message = "NÃO FOI POSSÍVEL ATUALIZAR: " + ex.getMessage();
            System.out.println("Erro: " + ex.getMessage());
        }
        return message;
    }

    public String acionarDeletar(Livro liv) {

        LivroDAO livdao = new LivroDAO();
        String message = "";
        try {
            livdao.deletar(liv);
            message = "EXCLUIDO COM SUCESSO";
        } catch (ClassNotFoundException | SQLException ex) {
            message = "NÃO FOI POSSIVEL EXCLUIR: " + ex.getMessage();
            System.out.println("Erro: " + ex.getMessage());
        }
        return message;
    }

    public Livro acionarConsultarPorId(Livro liv) {

        LivroDAO livdao = new LivroDAO();
        Livro livro = new Livro();
        String message = "";
        try {
            livro = livdao.consultarporId(liv);
        } catch (ClassNotFoundException | SQLException ex) {
            message = "NÃO FOI POSSIVEL EXCLUIR: " + ex.getMessage();
            System.out.println("Erro: " + ex.getMessage());
        }
        return livro;

    }
}
