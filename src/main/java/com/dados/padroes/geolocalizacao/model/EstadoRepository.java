package com.dados.padroes.geolocalizacao.model;

import com.dados.padroes.core.model.AbstractRepository;
import java.util.List;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class EstadoRepository extends AbstractRepository {

    private final QEstado qEstado = QEstado.estado;

    public List<Estado> getAll() {
        return from(qEstado).orderBy(qEstado.descricao.asc()).list(qEstado);
    }

    public Estado getById(final Integer id) {
        return em.find(Estado.class, id);
    }

    public Estado getByCodigo(final Integer codigo) {
        return from(qEstado).where(qEstado.codigo.eq(codigo)).uniqueResult(qEstado);
    }

}
