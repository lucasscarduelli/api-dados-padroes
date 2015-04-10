package com.dados.padroes.geolocalizacao.model;

import com.dados.padroes.core.model.AbstractRepository;
import com.mysema.query.jpa.impl.JPAQuery;
import java.util.List;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class PaisRepository extends AbstractRepository{

    private final QPais qPais = QPais.pais;

    public List<Pais> getAll() {
        return from(qPais).orderBy(qPais.descricao.asc()).list(qPais);
    }

}
