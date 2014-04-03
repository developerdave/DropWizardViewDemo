package uk.co.developer.views.demo.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class HomeResource {

    @GET
    public Response index() {

        return Response.ok().build();
    }
}
