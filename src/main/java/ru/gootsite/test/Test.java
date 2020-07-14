package ru.gootsite.test;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/pet")
@Produces({"application/json", "application/xml"})
@ApiResponse(description = "asdf")
public class Test {
    @DELETE
    @Path("/{petId}")
    public Response deletePet(
            String apiKey,
            Long petId) {
        //petData.deletePet(petId);
        return Response.ok().build();
    }
}
