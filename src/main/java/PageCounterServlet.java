import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(name = "PageCounterServlet", urlPatterns = "/pagecounter")
public class PageCounterServlet extends HttpServlet {
    public int hitCount = 0;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        hitCount++;


        if(Objects.equals(request.getParameter("resetcount"),"y")){
            hitCount= 0;
        }

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1> Site visits count: "+ hitCount+"</h1>");



    }
}
