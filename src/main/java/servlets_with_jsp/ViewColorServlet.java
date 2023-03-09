package servlets_with_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="ViewColorServlet",urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String favoriteColor = request.getParameter("color");
        request.setAttribute("favoriteColor", favoriteColor);
        if(favoriteColor != null) {
            request.getRequestDispatcher("/servlets_with_jsps/view_color.jsp").forward(request, response);
        }
    }
}
