package com.soa.resource;

import com.soa.entities.Compte;
import com.soa.service.CompteService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/comptes")
public class CompteResource {
    CompteService service = new CompteService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Compte> getAll() {
        return service.getAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Compte get(@PathParam("id") int id) {
        return service.getById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Compte create(Compte c) {
        return service.add(c);
    }
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Compte update(@PathParam("id") int id, Compte c) {
        return service.update(id, c);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") int id) {
        service.delete(id);
    }
}
