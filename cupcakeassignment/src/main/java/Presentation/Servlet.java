package Presentation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Business.Cupcake;
import Business.Customer;
import Business.LoginError;
import Business.ModelFacade;
import Data.DataMapper;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author peter
 */
@WebServlet(urlPatterns = {"/LoginServlet"})
public class Servlet extends HttpServlet {

    private final ModelFacade mf = new ModelFacade();
    private final DataMapper dm = new DataMapper();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String formName = request.getParameter("formName");
        switch (formName) {
            case "LoginForm":
                try {
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    Customer customer = mf.customerLogin(username, password);
                    request.getSession().setAttribute("username", username);
                    request.getSession().setAttribute("password", password);
                    response.setContentType("text/html;charset=UTF-8");
                    mf.validate(username, password);
                    forward("/shop.jsp", request, response);
                } catch (LoginError ex) {
                    request.setAttribute("error", "login");
                    forward("/login.jsp", request, response);
                }
                break;
            case "SignUpForm":
                try {
                    response.setContentType("text/html;charset=UTF-8");
                    String name = request.getParameter("name");
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    String email = request.getParameter("email");
                    String phone = request.getParameter("phone");
                    mf.customerSignUp(name, username, password, email, phone);
                    request.setAttribute("messageUserCreated", "Congratulations, your new account has been created! Log in with your username and password.");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                } catch (SQLException | NullPointerException e) {
                    System.out.println(e.getMessage());
                    request.getRequestDispatcher("LoginError.jsp").forward(request, response);
                }
                break;
            case "Buy":
                try {
                    response.setContentType("text/html;charset=UTF-8");
                    String topping = request.getParameter("topping");
                    String bottom = request.getParameter("bottom");
                    Cupcake cupcake = mf.getCupcake(topping, bottom);
                    request.getSession().setAttribute("cupcake", cupcake);
                    request.getRequestDispatcher("shop.jsp").forward(request, response);
                } catch (SQLException | NullPointerException e) {
                    System.out.println(e.getMessage());
                    request.getRequestDispatcher("LoginError.jsp").forward(request, response);
                }
                break;
        }
    }

    private void forward(String url, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
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
        try{
            processRequest(request, response);
        } catch (SQLException e){
            
        }
        
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
        try{
            processRequest(request, response);
        } catch (SQLException e){
            
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
