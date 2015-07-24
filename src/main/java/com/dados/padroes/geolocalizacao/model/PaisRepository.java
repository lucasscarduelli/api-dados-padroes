package com.dados.padroes.geolocalizacao.model;

import com.dados.padroes.core.model.AbstractRepository;
import java.util.List;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class PaisRepository extends AbstractRepository {

    private final QPais qPais = QPais.pais;

    public List<Pais> getAll() {
        return from(qPais).orderBy(qPais.descricao.asc()).list(qPais);
    }

    public Pais getById(final Integer id) {
        return em.find(Pais.class, id);
    }

    public Pais getByCodigo(final Integer codigo) {
        return from(qPais).where(qPais.codigo.eq(codigo)).uniqueResult(qPais);
    }

}
