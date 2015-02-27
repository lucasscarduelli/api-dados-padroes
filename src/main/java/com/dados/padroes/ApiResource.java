package com.dados.padroes;

import com.dados.padroes.geolocalizacao.GeolocalizacaoResource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@Stateless
@ApplicationPath("/api")
@Path("")
public class ApiResource extends Application {

    @Inject
    private GeolocalizacaoResource geolocalizacaoResource;

    @Path("geolocalizacao")
    public GeolocalizacaoResource geolocalizacaoResource() {
        return geolocalizacaoResource;
    }

}
