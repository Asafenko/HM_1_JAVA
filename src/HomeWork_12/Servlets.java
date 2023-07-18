package HomeWork_12;

import java.io.IOException;
import java.io.PrintWriter;
public class Servlets extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Quote Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Quote by Linus Torvalds:</h1>");
        out.println("<p>Bad programmers worry about the code. Good programmers worry about data structures and their relationships.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}