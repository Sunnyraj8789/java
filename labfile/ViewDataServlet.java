import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewDataServlet")
public class ViewDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve and display data from the database or storage mechanism
        // For simplicity, we are hardcoding some data here

        out.println("<html><body>");
        out.println("<h2>View Data</h2>");
        out.println("<p>Name: John Doe</p>");
        out.println("<p>Email: john.doe@example.com</p>");
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");

        out.close();
    }
}
