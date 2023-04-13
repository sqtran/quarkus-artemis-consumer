import org.apache.camel.builder.RouteBuilder;
//import org.apache.camel.component.artemis.ArtemisConstants;

public class ArtemisConsumerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("artemis:queue:myQueue0")
            .routeId("myRoute")
            .log("Received message from Artemis queue: ${body}")
            //.to("log:myLogger")
  //          .setHeader(ArtemisConstants.JMS_REPLY_TO, constant("anotherQueue"))
            .setBody(constant("Hello from Camel!"));
    }
}