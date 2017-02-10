package sample;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by Solovyev on 11/02/2017.
 */
public class Application {

    public static final int PORT = 8081;

    public static void main(String[] args) throws Exception {
        final Server server = new Server(PORT);
        final ServletContextHandler servletContextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        final ServletHolder servletHolder = new ServletHolder(new UserServlet());
        servletContextHandler.addServlet(servletHolder, "/api/user");
        server.setHandler(servletContextHandler);
        server.start();
        server.join();
    }
}
