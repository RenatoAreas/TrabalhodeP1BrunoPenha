/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author Renato
 */
@WebServlet(name = "TrataLoginDJ", urlPatterns = {"/TrataLoginDJ"})
public class TrataLoginDJ extends HttpServlet {

    public boolean verificaLogin(Usuario usuario) {

        return "RenatoAreas".equals(usuario.getUsuario()) && "Caroline".equals(usuario.getSenha());
    }
}