package de.seppe.zero.trust.server;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.logging.Level;
import java.util.logging.Logger;


@Path("/hi")
public class HelloService {

    private static final Logger LOGGER = Logger.getLogger(HelloService.class.getName());

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        LOGGER.log(Level.INFO, "Request auf dem Server ist angekommen");

        return "Hello from a Zero Trust Server with mTLS active. ";
    }
}
