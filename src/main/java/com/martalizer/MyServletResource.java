package com.martalizer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class MyServletResource {

    @GET
    @Path("{namn}")
    public String getIt(@PathParam(value = "namn") String namn) {
        return "Personal page for: " + namn;
    }
}
