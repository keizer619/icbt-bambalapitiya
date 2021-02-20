/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icbt.test.web.rest;

/**
 *
 * @author tharik
 */
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
 
@Path("/jsonServices")
public class JerseyRestService {
 
    @GET
    @Path("/print/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student produceJSON( @PathParam("name") String name ) {
        Student st = new Student(name, "D",22,1);
        return st;
    }
    
    @POST
    @Path("/send")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response consumeJSON( Student student ) {
 
        //String output = student.toString();
 
        return Response.status(200).entity(student.getFirstName()).build();
    }
 
}
