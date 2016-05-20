package com.dados.padroes.geolocalizacao.model;

import com.dados.padroes.core.model.AbstractRepository;
import java.util.List;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class CidadeRepository extends AbstractRepository {

    private final QCidade qCidade = QCidade.cidade;

    public List<Cidade> getAll() {
        return from(qCidade).orderBy(qCidade.descricao.asc()).list(qCidade);
    }

    public Cidade getById(final Integer id) {
        return em.find(Cidade.class, id);
    }

    public Cidade getByCodigo(final Integer codigo) {
        return from(qCidade).where(qCidade.codigo.eq(codigo)).uniqueResult(qCidade);
    }

}
