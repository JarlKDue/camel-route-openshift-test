import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication
@Component
public class TimerRoute extends RouteBuilder {

//<editor-fold desc="Full Route Description">
    //Define Finals Here

//<editor-fold desc="Direct Log Endpoints">


    //-------------------------------------------------------------------------------//
//</editor-fold>

//<editor-fold desc="Route Start Points">


    //-------------------------------------------------------------------------------//
//</editor-fold>

//<editor-fold desc="Routes By ID">


    //-------------------------------------------------------------------------------//
//</editor-fold>

//<editor-fold desc="Specific Route Endpoints">


    //-------------------------------------------------------------------------------//
//</editor-fold>

//<editor-fold desc="Routes Walkthrough">

   
      /*
      Route Walkthrough
      Purpose
      Tools
      Speficis
      Error Handling
     */
    //</editor-fold>

//</editor-fold>

    public static void main(String[] args){
        SpringApplication.run(TimerRoute.class, args);
    }

    @Override
    public void configure() throws Exception {
        from("timer://foo?period=5000")
                .setBody().constant("Hello World")
                .log(">>> ${body}");

    }


}