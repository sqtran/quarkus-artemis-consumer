import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.builder.RouteBuilder;

@ApplicationScoped
public class ArtemisConsumerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("jms:queue:myQueue0?testConnectionOnStartup=true")
            .routeId("myRoute")
            .log("Received message from Artemis queue: ${body}")
            .setBody(constant("Hello from Camel!"));
    }
}