package com.dados.padroes.core.model;

import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.EntityPath;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

abstract public class AbstractRepository {

    protected EntityManager em;
    
    public AbstractRepository() {
        em = Persistence.createEntityManagerFactory("dados-padroes-PU").createEntityManager();
    }
    
    protected JPAQuery from(final EntityPath entityPath) {
        return new JPAQuery(em).from(entityPath);
    }

}
