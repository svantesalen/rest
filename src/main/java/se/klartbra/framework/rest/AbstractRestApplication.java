package se.klartbra.framework.rest;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public abstract class AbstractRestApplication {
	
    public void startRestApplication(String applicationName, int port, 
    		String applicationClassCanonicalName) throws Exception 
    {
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        
        System.out.println("###### Starting "+applicationClassCanonicalName);
//      Context Path- this helps container to choose the correct web application
        context.setContextPath("/"+applicationName);
        
        Server jettyServer = new Server(port);
        jettyServer.setHandler(context);
//        <init-param>
//        <param-name>com.sun.jersey.api.json.POJOMappingFeature</param-name>
//        <param-value>true</param-value>
//    </init-param>
        ServletHolder jerseyServlet = context.addServlet(
             org.glassfish.jersey.servlet.ServletContainer.class, "/*");
        jerseyServlet.setInitOrder(0);
        
        // Tells the Jersey Servlet which REST service/class to load.
        jerseyServlet.setInitParameter(
                "jersey.config.server.provider.classnames",
                applicationClassCanonicalName);
//        jerseyServlet.setInitParameter(
//                "com.sun.jersey.api.json.POJOMappingFeature",
//                "true");
//           theApplication.getClass().getCanonicalName()); 
        try {
            jettyServer.start();
            jettyServer.join();
        } finally {
            jettyServer.destroy();
        }
    }

}
