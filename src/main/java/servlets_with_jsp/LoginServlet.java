package servlets_with_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        if(request.getSession().getAttribute("username") != null){
            response.sendRedirect("/profile");
            return;
        }

        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean validAttempt = username.equals("admin") && password.equals("password");
        if(validAttempt){

            session.setAttribute("username", username);

            //redirect to profile page
            response.sendRedirect("/profile");
        }else{
            //if we get here the user is not an admin so we reload the login page
            response.sendRedirect("/login");
        }

    }
}
