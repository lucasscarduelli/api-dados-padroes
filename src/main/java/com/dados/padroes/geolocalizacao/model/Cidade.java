package com.dados.padroes.geolocalizacao.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "cidade")
public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_estado")
    @SequenceGenerator(name = "seq_estado", sequenceName = "seq_estado")
    private Integer id;
    @NotNull
    private Integer codigo;
    @NotNull
    @Size(max = 100)
    private String descricao;

    private Cidade() {
    }

    private Cidade(final Integer codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static class Builder {

        private Integer codigo;
        private String descricao;

        public static Builder create() {
            return new Builder();
        }

        public Builder codigo(final Integer codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder descricao(final String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Cidade build() {
            return new Cidade(this.codigo, this.descricao);
        }

    }

}
