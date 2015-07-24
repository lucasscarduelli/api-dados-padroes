package com.dados.padroes.geolocalizacao.api;

import com.dados.padroes.geolocalizacao.model.PaisRepository;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PaisResource {

    @Inject
    private PaisRepository paisRepository;

    @GET
    public List<PaisDto> getAll() {
        return PaisDto.Representation.toRepresentarion(paisRepository.getAll());
    }

    @GET
    @Path("{codigo}")
    public PaisDto getByCodigo(final @PathParam("codigo") Integer codigo) {
        return PaisDto.Representation.toRepresentation(paisRepository.getByCodigo(codigo));
    }

}
