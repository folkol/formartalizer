import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.UriBuilder;

import org.glassfish.grizzly.http.server.HttpServer;

import com.sun.jersey.api.container.grizzly2.GrizzlyWebContainerFactory;


public class Main {

    public static void main(String[] args) throws IOException {
        final Map<String, String> initParams = new HashMap<String, String>();

        initParams.put("com.sun.jersey.config.property.packages", "com.martalizer");

        HttpServer httpServer = GrizzlyWebContainerFactory.create(UriBuilder.fromUri("http://localhost/").port(1234).build(), initParams);
        System.out.println(String.format("Server started: http://localhost:1234/yournamegoeshere"));
        System.in.read();
        httpServer.stop();
    }
}
