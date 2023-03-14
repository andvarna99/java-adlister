package servlets_with_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="PickColorServlet",urlPatterns = "/pickcolor")
public class PickColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/servlets_with_jsps/pick_color.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String favoriteColor = request.getParameter("favoriteColor");
        if(favoriteColor != null){
            System.out.println("favorite color is: " + favoriteColor);
            response.sendRedirect("/viewcolor?color="+favoriteColor);
        }
    }
}
