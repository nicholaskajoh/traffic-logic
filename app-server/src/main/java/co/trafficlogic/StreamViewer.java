package co.trafficlogic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/")
public class StreamViewer extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("tl_user", "ivy");
        request.setAttribute("tl_password", "secret419");
        request.getRequestDispatcher("/stream-viewer.jsp").forward(request, response);
    }
 
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>Hi, StreamViewer</html>");
        writer.flush();
    }
}
