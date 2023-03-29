/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.devcaotics.controllers;

import com.devcaotics.model.entities.Piloto;
import com.devcaotics.model.repositorios.RepositorioPiloto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author usuario
 */
@WebServlet(name = "PilotoServlet", urlPatterns = {"/PilotoServlet"})
public class PilotoServlet extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PilotoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Pilotos " + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        
        String atualizar = request.getParameter("atualizar");
        String codAux = request.getParameter("codigo");
        
        if(atualizar != null) {
            
            int codigo = Integer.parseInt(codAux);
            
            Piloto p = RepositorioPiloto.getCurrentInstance().ler(codigo);
            
            response.setContentType("text/html;charset=UTF-8");
                try ( PrintWriter out = response.getWriter()) {
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>PilotoServlet</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Piloto Recuperado "+ "</h1>");  
                    out.println("<a href=\"PilotoServlet\">Lista de Pilotos</a><br/>");
                    out.println("<form method=\"post\" action=\"PilotoServlet\">\n"
                            + "            Código: <input type=\"hidden\" name=\"cod\" value=\""+ p.getCodigo() + "\"/><br/>\n"
                            + "            Apelido: <input type=\"text\" name=\"apelido\" value=\""+ p.getCodNome() + "\"/><br/>\n"
                            + "            Carro: <input type=\"text\" name=\"carro\" value=\""+ p.getCarro() + "\"/><br/>\n"
                            + "            Contato: <input type=\"text\" name=\"contato\" value=\""+ p.getContato() + "\"/><br/>\n"
                            + "            <input type='hidden' name='atualizar' value='1'>" 
                            + "            \n"
                            + "            <input type=\"submit\" value=\"atualizar\"/>\n"
                            + "        </form>");
                    out.println("<a href=\"index.html\">Home</a><br/>");
                    out.println("</body>");
                    out.println("</html>");
                }
        }
        
        if(codAux == null && atualizar == null){
            
            List<Piloto> pilotos = RepositorioPiloto.getCurrentInstance().lerTudo();
            response.setContentType("text/html;charset=UTF-8");
            
            try ( PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>PilotoServlett</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Pilotos "+ "</h1>");
                out.println("<table border=1>");
                
                  out.println(
                             "<tr>"
                             + "<th>Codigo</th>"
                             + "<th>Apelido</th>"
                             + "<th>Carro</th>"
                             + "<th>Contato</th>"
                             +"<th> Operacoes</th>"
                             + "</tr>");

                 for(Piloto p : pilotos) {
                     
                     out.println("<tr>");
                        out.println("<td>" + p.getCodigo() + "</td>");
                        out.println("<td>" + p.getCodNome() + "</td>");
                        out.println("<td>" + p.getCarro() + "</td>");
                        out.println("<td>" + p.getContato() + "</td>");
                        out.println("<td><a href=\"PilotoServlet?codigo=" + p.getCodigo() + "\"> Visualizar </a>"
                                + "<a href='PilotoServlet?codigo=" + p.getCodigo() + "&atualizar=1'></a></td>");
                     out.println("</tr>");
                 }
                out.println("</table>");
                out.println("<a href=\"index.html\">Home</a><br/>");
                out.println("</body>");
                out.println("</html>");
        }
        } else {
        
            int codigo = Integer.parseInt(codAux);

            Piloto p = RepositorioPiloto.getCurrentInstance().ler(codigo);

            response.setContentType("text/html;charset=UTF-8");
                try ( PrintWriter out = response.getWriter()) {
                    /* TODO output your page here. You may use following sample code. */
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>PilotoServlett</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>Piloto Recuperado "+ "</h1>");
                    out.println("Codigo: " + p.getCodigo() + "<br/>");
                    out.println("Apelido: " + p.getCodNome()+ "<br/>");
                    out.println("Carro: " + p.getCarro() + "<br/>");
                    out.println("Contato: " + p.getContato()+ "<br/>");  
                    out.println("<a href=\"index.html\">Home</a><br/>");
                    out.println("</body>");
                    out.println("</html>");
                }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int codigo = Integer.parseInt(request.getParameter("cod"));
        String apelido = request.getParameter("apelido");
        String carro = request.getParameter("carro");
        String contato = request.getParameter("contato");
        
        String atualizar = request.getParameter("atualizar");
        
        Piloto p = new Piloto();
        
        p.setCodigo(codigo);
        p.setCodNome(apelido);
        p.setCarro(carro);
        p.setContato(contato);
        
//        RepositorioPiloto.getCurrentInstance().inserir(p);
        
        if(atualizar != null) {
            RepositorioPiloto.getCurrentInstance().alterar(p);
        } else {
            RepositorioPiloto.getCurrentInstance().inserir(p);
            
        }
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CadastroPilotoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Piloto "+p.getCodNome()+" cadastrado com sucesso!</h1>");
            out.println("<a href='index.html'>Home</a>");
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
