package servlets_with_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="LossServlet",urlPatterns = "/incorrect")
public class LossServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String guessedNumber = request.getParameter("number");
        String randomNumber = request.getParameter("randomNum");
        request.setAttribute("guessedNumber", guessedNumber);
        request.setAttribute("randomNumber",randomNumber);
        request.setAttribute("message", "incorrect");

        request.getRequestDispatcher("/servlets_with_jsps/viewing.jsp").forward(request, response);

    }

}
