package com.dados.padroes.geolocalizacao;

import com.dados.padroes.geolocalizacao.api.PaisResource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Stateless
public class GeolocalizacaoResource {

    @Inject
    private PaisResource paisResource;

    @Path("pais")
    public PaisResource paisResource() {
        return paisResource;
    }

}
