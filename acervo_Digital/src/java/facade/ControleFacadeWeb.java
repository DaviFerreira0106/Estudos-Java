/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import Util.Upload;
import br.com.commandfactory.controller.ICommand;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControleFacadeWeb {

    public void acionar(HttpServletRequest request, HttpServletResponse response, Upload objUpload) throws ServletException, IOException {
        try {
            /* Variavel que pega a informação passada dos formularios */
            String get_Parameter = objUpload.getForm().get("btnOperacao").toString();

            /* Montagem do nome da classe de acordo com solicitação requisitada */
            String nomeClasse = "br.com.commandfactory.controller." + get_Parameter + "LivroAction";

            /* Criação de classe (meta-programação) */
            Class classeAction = Class.forName(nomeClasse);

            /* Instancia a classe utilizando a factory da classe criada */
            ICommand commandAction = (ICommand) classeAction.newInstance();

            /* Executa a ação */
            String pageDispatcher = commandAction.executar(request, response, objUpload);
            RequestDispatcher rd = request.getRequestDispatcher(pageDispatcher);
            rd.forward(request, response);
        } catch (Exception e) {
            request.setAttribute("message", e);
            RequestDispatcher rd = request.getRequestDispatcher("/respostaTemp.jsp");
            rd.forward(request, response);
        }
    }
}
