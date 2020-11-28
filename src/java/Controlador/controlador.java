/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import ModeloDAO.AlumnoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AxelHOOLIC
 */
public class controlador extends HttpServlet {
    
    AlumnoDAO dao;

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
        String accion=request.getParameter("accion");
        List<Alumno>alumnos=new ArrayList<>();
        
        switch(accion){
            case "listar":
                dao=new AlumnoDAO();
                alumnos=dao.getAlumno();
                request.setAttribute("Alumnos", alumnos);
                request.getRequestDispatcher("index.jsp").forward(request, response);
                break;
                
            case "agregar":
                request.getRequestDispatcher("Agregar.jsp").forward(request, response);
                break;
                
            case "nuevo":
                int r=0;
                String nombre=request.getParameter("txtnombre");
                String apellido=request.getParameter("txtapellido");
                int nota1 = Integer.parseInt(request.getParameter("txtnota1"));
                int nota2 = Integer.parseInt(request.getParameter("txtnota2"));
                float promedio;
                promedio = (float)(nota1 + nota2) / 2;
                Alumno a=new Alumno();
                a.setNombre(nombre);
                a.setApellido(apellido);
                a.setNota1(nota1);
                a.setNota2(nota2);
                a.setPromedio(promedio);
                r=dao.add(a);
                if(r != 0){
                    request.setAttribute("mensaje", "se agrego con exito");
                    request.getRequestDispatcher("mensaje.jsp").forward(request, response);
                }else{
                    request.setAttribute("mensaje", "error al guardar");
                    request.getRequestDispatcher("mensaje.jsp").forward(request, response);
                }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
