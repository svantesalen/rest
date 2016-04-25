package se.klartbra.restImpl; 

//import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

 
public class Starter {
	
	public static String applicationName = "provisioning";
	public static int port = 8080;
	
    public static void main(String[] args) throws Exception {
//    	startRestApplication(applicationName, port);
    	new ProfilerApplication();
    	
    }
    
//    public static void startRestApplication(String applicationName, int port) throws Exception {
//        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
//
////      Context Path- this helps container to choose the correct web application
//        context.setContextPath("/"+applicationName);
//        
//        Server jettyServer = new Server(port);
//        jettyServer.setHandler(context);
// 
//        ServletHolder jerseyServlet = context.addServlet(
//             org.glassfish.jersey.servlet.ServletContainer.class, "/*");
//        jerseyServlet.setInitOrder(0);
//        
//        // Tells the Jersey Servlet which REST service/class to load.
//        jerseyServlet.setInitParameter(
//           "jersey.config.server.provider.classnames",
//           EntryPoint.class.getCanonicalName()); 
//        try {
//            jettyServer.start();
//            jettyServer.join();
//        } finally {
//            jettyServer.destroy();
//        }
//    }
}
//
/*
 * 
 * Its very important to know how container picks a servlet from which web app .(means how it identify the correct web app and then correct servlet)

Since the request uri consist of three main parts
Context Path- this helps container to choose the correct web app
ServletPath-this helps container to identify correct servlet into the from the requested web app.
PathInfo-in case of directory match
-------------
 * Quote
"URL is : http://server:8080/AppName/Abc/Servlet?param1=value1�m2=value2
so what is the context path, servlet path and path info for these URL's?"

Request URI=context path + servlet path + path info+query string

Request_URI = Context_Path [1] + Servlet_Path [2] + Path_Info [3] + Query_String [4] 
/catalog[2]/product[3]?mode=view[4]]http://server.com/my_app_context[1]/catalog[2]/product[3]?mode=view[4] 

Context Path/AppName

Servlet Path /ABC

Path Info/Servlet

Query String param1=value1&m2=value2
 */