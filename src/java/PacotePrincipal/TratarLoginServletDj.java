/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacotePrincipal;

import Usuarios.TrataLoginDJ;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Renato
 */
@WebServlet(name = "TratarLoginServlet", urlPatterns = {"/TratarLoginServlet"})
public class TratarLoginServletDj extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String usuario = request.getParameter("Login");
            String senha = request.getParameter("senha");
           Usuario objUsuario = new Usuario();

            objUsuario.setUsuario(usuario);
            objUsuario.setSenha(senha);

            TrataLoginDj trataLogin = new TrataLoginDj();

            if (trataLogin.verificaLogin(objUsuario)) {

                HttpSession sessao = request.getSession();

                sessao.setAttribute("usuarioSessao", objUsuario);

                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet TratarLoginServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> Usuario ok " + objUsuario.getUsuario() + "</h1>");
                out.println("<a href=\"catalogoProdutos\">Clique aqui para listar o catalogo de produtos</a>");
                out.println("</body>");
                out.println("</html>");
            } else {

                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet TratarLoginServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1> Usuario ou senha incorreta </h1>");
                out.println("</body>");
                out.println("</html>");
            }

        } finally {
            out.close();
        }
    }
}