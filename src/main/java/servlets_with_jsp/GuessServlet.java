package servlets_with_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

@WebServlet(name="GuessServlet",urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("/WEB-INF/servlets_with_jsps/guessing.jsp").forward(request, response);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String guessedNumber = request.getParameter("guessNumber");
        System.out.println(guessedNumber);

        String randomNum = String.valueOf(ThreadLocalRandom.current().nextInt(1,3 + 1));

        if (Objects.equals(guessedNumber, randomNum) && guessedNumber != null){

            System.out.println("you picked: " + guessedNumber + "\t correct answer was: " + randomNum);

            response.sendRedirect("/correct?number="+guessedNumber);

        } else if(guessedNumber != null && !Objects.equals(guessedNumber, randomNum)){

            System.out.println("you picked: " + guessedNumber + "\t correct answer was: " + randomNum);

            response.sendRedirect("/incorrect?number="+guessedNumber+"&randomNum="+randomNum);
        }
    }
}
