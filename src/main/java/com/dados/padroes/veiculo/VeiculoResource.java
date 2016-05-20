package com.dados.padroes.veiculo;

import com.dados.padroes.veiculo.model.MarcaResource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Stateless
public class VeiculoResource {

    @Inject
    private MarcaResource marcaResource;

    @Path("marca")
    public MarcaResource marcaResource() {
        return marcaResource;
    }

}
