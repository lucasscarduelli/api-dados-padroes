package com.dados.padroes.geolocalizacao.model;

import com.mysema.query.jpa.impl.JPAQuery;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class PaisRepository {

    private final QPais qPais = QPais.pais;

    protected EntityManager em;

    public PaisRepository() {

        em = Persistence.createEntityManagerFactory("dados-padroes-PU").createEntityManager();
    }

    public List<Pais> getAll() {

        return new JPAQuery(em).from(qPais).orderBy(qPais.descricao.asc()).list(qPais);
    }

}
