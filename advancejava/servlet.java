package advancejava;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.Webservlet;
import javax.servlet.http.httpServlet;
import javax.servlet.http.httpServletRequest;
import javax.servlet.http.httpServletResponse;



@Webservlet("/hello")

public class hellworldservlet extends httpServlet {
    private static final long serialVersionUID = 1L;

    @Override 
    protected void doGet(httpServletRequest request,httpServletResponse response) throws serveletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Hello World! </h1>");

    }
}