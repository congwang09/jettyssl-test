package comet.api;

import io.swagger.jaxrs.config.SwaggerContextService;

import io.swagger.models.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.HttpConfiguration;
import org.eclipse.jetty.server.HttpConnectionFactory;
import org.eclipse.jetty.server.SecureRequestCustomizer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.SslConnectionFactory;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.webapp.WebAppContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;


public class Bootstrap extends HttpServlet {
  
	private static final long serialVersionUID = 1L;
	// the keystore (with one key) we'll use to make the connection with the
	// broker
	private final static String KEYSTORE_LOCATION = "src/main/resources/config/keys/jetty-ssl.keystore";
	private final static String KEYSTORE_PASS = "";
	
	// the truststore we use for our server. This keystore should contain all the keys
	// that are allowed to make a connection to the server
	private final static String TRUSTSTORE_LOCATION = "src/main/resources/config/keys/jetty-ssl.keystore";
	private final static String TRUSTSTORE_PASS = "";

  
  
	@Override
	public void init(ServletConfig config) throws ServletException {
		Info info = new Info()
		  .title("Comet Server")
		  .description("COMET Accumulo Query Layer API")
		  .termsOfService("None")
		  .contact(new Contact()
		  .email("cwang@renci.org"))
		  .license(new License()
		  .name("Eclipse Public License"));
		ServletContext sc = config.getServletContext();
		SslContextFactory sslContextFactory = new SslContextFactory(KEYSTORE_LOCATION);
		sslContextFactory.setKeyStorePassword(KEYSTORE_PASS);
		sslContextFactory.setTrustStorePath(TRUSTSTORE_LOCATION);
		sslContextFactory.setTrustStorePassword(TRUSTSTORE_PASS);
		sslContextFactory.setNeedClientAuth(true);

		Swagger swagger = new Swagger().info(info);
		new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);

	}
  
/*	public Bootstrap() {
	  
	}
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.getWriter().println("First Servlet on Jetty - Java Code Geeks");
	}
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	}*/
  


/*	
	public static void main(String[] args) throws Exception {

		// create a jetty server and setup the SSL context
		Server server = new Server();
		SslContextFactory sslContextFactory = new SslContextFactory(KEYSTORE_LOCATION);
		sslContextFactory.setKeyStorePassword(KEYSTORE_PASS);
		sslContextFactory.setTrustStorePath(TRUSTSTORE_LOCATION);
		sslContextFactory.setTrustStorePassword(TRUSTSTORE_PASS);
		sslContextFactory.setNeedClientAuth(true);

		// create a https connector
		SslSocketConnector connector = new SslSocketConnector(sslContextFactory);
		connector.setPort(8443);

		// register the connector
		server.setConnectors(new Connector[] { connector });

		ServletContextHandler scHandler = new ServletContextHandler(server,"/");
		scHandler.addServlet(NameOfServlet.class, "/");
		server.start();
		server.join();
	}*/
}





