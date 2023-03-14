package servlets_with_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="PizzaOrderFormServlet",urlPatterns = "/pizza-order")
public class PizzaOrderFormServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/servlets_with_jsps/pizza_order_form.jsp").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        handles form submission
        System.out.println("post submitted!");
        String address = request.getParameter("address");
        String crustType = request.getParameter("crustType");
        String sauceType = request.getParameter("sauceType");
        String sizeType = request.getParameter("sizeType");
        String[] toppings = request.getParameterValues("toppings");
        if (address != null && crustType != null && sauceType != null && sizeType != null && toppings != null){

            System.out.println("address is: " + address);
            System.out.println("crust type is: " + crustType);
            System.out.println("sauce type is: " + sauceType);
            System.out.println("size type is: " + sizeType);
            System.out.println("toppings are: ");
            for (String topping: toppings) {
                System.out.println("\t" + topping);
            }
            request.getRequestDispatcher("/WEB-INF/servlets_with_jsps/pizza_order_form.jsp").forward(request, response);

        }
    }
}
