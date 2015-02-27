package com.dados.padroes.geolocalizacao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pais")
    @SequenceGenerator(name = "seq_pais", sequenceName = "seq_pais")
    private Integer id;
    private Integer codigo;
    private String descricao;

    private Pais() {
    }

    private Pais(final Integer codigo, final String descricao) {
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

        public Pais build() {
            return new Pais(this.codigo, this.descricao);
        }

    }

}
