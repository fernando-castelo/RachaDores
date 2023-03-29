/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devcaotics.controllers;

import com.devcaotics.model.entities.Organizador;
import com.devcaotics.model.repositorios.RepositorioOrganizador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ALUNO
 */
@WebServlet(name = "CadastroOrganizadorServlet", urlPatterns = {"/CadastroOrganizadorServlet"})
public class CadastroOrganizadorServelet extends HttpServlet {


/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */

 @Override
 protected void doGet(HttpServletRequest request, HttpServletResponse response)
 throws ServletException, IOException {

 }

/**
 * Handles the HTTP <code>POST</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

         int codigo = Integer.parseInt(request.getParameter("cod"));
         String apelido = request.getParameter("apelido");
         String contato = request.getParameter("contato");
         String observacao = request.getParameter("observacao");

         Organizador org = new Organizador();

         org.setCodigo(codigo);
         org.setCodNome(apelido);
         org.setContato(contato);
         org.setObservacao(observacao);

         RepositorioOrganizador.getCurrentInstance().inserir(org);

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        /* TODO output your page here. You may use following sample code. */
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet CadastroOrganizadorServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Organizdor"+org.getCodNome()+" cadastrado com sucesso!</h1>");
        out.println("<a href='index.html'>home</a>");
        out.println("</body>");
        out.println("</html>");
    }
}

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
