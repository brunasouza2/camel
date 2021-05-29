package com.br.example.microservices.camelmicroservicea.route.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyFirstTimerRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // queue - timer
        // transformation
        // database - log
        //Exchange[ExchangePattern: InOnly, BodyType: null, Body: [Body is null]]
        from("timer:first-timer") // queue
//        .transform().constant("My Constant Message")
        .transform().constant("Time now is "+ LocalDate.now())
        .to("log:first-timer"); // database
    }
}
