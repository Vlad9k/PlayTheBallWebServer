/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PlayTheBallWebServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ragulin
 */
public class AddResults extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String leftScore = request.getParameter("leftScore");
        String rightScore = request.getParameter("rightScore");
        String playerName = request.getParameter("playerName");
        String playerComments = request.getParameter("playerComments");
        if (!isStringEmpty(leftScore)
                && !isStringEmpty(rightScore)
                && !isStringEmpty(playerName)) {
            ServletContext application = getServletContext();
            List<GameResult> grList = (List<GameResult>) application.getAttribute("gameResults");
            if (grList == null) {
                grList = new ArrayList<GameResult>();
            }
            GameResult gr = new GameResult();
            gr.setLeftScore(leftScore);
            gr.setRightScore(rightScore);
            gr.setPlayerName(playerName);
            gr.setPlayerComments(playerComments);
            grList.add(gr);
            application.setAttribute("gameResults", grList);
        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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

    private boolean isStringEmpty(String str) {
        return (str == null || str.equals(""));
    }
}
