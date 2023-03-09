package servlets_with_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="WinServlet",urlPatterns = "/correct")
public class WinServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String guessedNumber = request.getParameter("number");
        request.setAttribute("guessedNumber", guessedNumber);
        request.setAttribute("message", "correct");

        request.getRequestDispatcher("/servlets_with_jsps/viewing.jsp").forward(request, response);

    }

}
