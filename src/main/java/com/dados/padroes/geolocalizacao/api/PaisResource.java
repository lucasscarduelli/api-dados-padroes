package com.dados.padroes.geolocalizacao.api;

import com.dados.padroes.geolocalizacao.model.Pais;
import com.dados.padroes.geolocalizacao.model.PaisRepository;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PaisResource {

    
    @GET
    public List<Pais> getPaises() {
        return new PaisRepository().getAll();
    }

}
