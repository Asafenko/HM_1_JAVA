package HomeWork_12;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlets_2 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String operation = request.getParameter("operation");
        double operand1 = Double.parseDouble(request.getParameter("operand1"));
        double operand2 = Double.parseDouble(request.getParameter("operand2"));
        double result = 0;

        switch (operation) {
            case "add":
                result = operand1 + operand2;
                break;
            case "subtract":
                result = operand1 - operand2;
                break;
            case "multiply":
                result = operand1 * operand2;
                break;
            case "divide":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    out.println("<html><body><h1>Error: Division by zero!</h1></body></html>");
                    return;
                }
                break;
            case "power":
                result = Math.pow(operand1, operand2);
                break;
            case "percentage":
                result = (operand1 * operand2) / 100;
                break;
            default:
                out.println("<html><body><h1>Error: Invalid operation!</h1></body></html>");
                return;
        }

        out.println("<html>");
        out.println("<head><title>Calculator Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Calculator Result:</h1>");
        out.println("<p>Operand 1: " + operand1 + "</p>");
        out.println("<p>Operand 2: " + operand2 + "</p>");
        out.println("<p>Operation: " + operation + "</p>");
        out.println("<p>Result: " + result + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
