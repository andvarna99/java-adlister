package books;

import ads.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="CreateBookServlet", urlPatterns = "/books/create")
public class CreateBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB_INF/books/create.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book newBook = new Book(req.getParameter("title"),req.getParameter("author"));
        long newId = DaoFactory.getBooksDao().insert(newBook);
        if(newId != 0){
            resp.sendRedirect("/books");
        }else{
            resp.sendRedirect("/books/create?error");
        }

    }
}
