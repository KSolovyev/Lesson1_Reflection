package sample;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Solovyev on 09/02/2017.
 */
public class UserHandler {

    public static final int OK_200 = 200;

    public void handle(String msg, HttpServletResponse response) throws IOException {
        response.setStatus(OK_200);
        response.setHeader("Content-Type", "application/json");
        response.getWriter().print("{\"msg\": " + msg + '}');
    }
}
