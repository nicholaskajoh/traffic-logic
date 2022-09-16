package co.trafficlogic;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/stream-auth")
public class StreamAuth extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final String queryString = request.getQueryString() == null ? "" : request.getQueryString();
        final String[] params = queryString.split("&");
        String secretKey = null;
        for (String param: params) {
            final String[] kv = param.split("=");
            if (kv.length == 2 && kv[0].equals("secret_key")) {
                secretKey = kv[1];
                break;
            }
        }
        String tlPassword = System.getenv("TRAFFIC_LOGIC_PASSWORD");

        if (secretKey != null && secretKey.equals(tlPassword)) {
            response.setStatus(200);
        } else {
            response.setStatus(403);
        }
    }
}
