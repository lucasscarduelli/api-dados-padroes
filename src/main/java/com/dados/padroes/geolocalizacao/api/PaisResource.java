package com.dados.padroes.geolocalizacao.api;

import com.dados.padroes.geolocalizacao.model.Pais;
import java.util.ArrayList;
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
        return getPaisesMock();
    }
    
    private List<Pais> getPaisesMock() {
        
        final Pais brasil = new Pais(1, "Brasil");
        final Pais argentina = new Pais(2, "Argentina");
        final Pais espanha = new Pais(3, "Espanha");
        
        final List<Pais> paises = new ArrayList<>();
        paises.add(brasil);
        paises.add(argentina);
        paises.add(espanha);
        
        return paises;
    }
    
}
