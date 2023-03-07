import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/helloworld")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        String message = "Hello, World!";

        String name = request.getParameter("name");

        PrintWriter out = response.getWriter();
        out.println("<h1>"+ message +"</h1>");

        if(name != null ) {
            message = "Hello, " + name + "!";
        }
    }
}
