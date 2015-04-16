package com.dados.padroes.geolocalizacao.api;

import com.dados.padroes.geolocalizacao.model.Pais;
import java.util.ArrayList;
import java.util.List;

public final class PaisDto {

    private Integer codigo;
    private String descricao;

    private PaisDto() {
    }

    private PaisDto(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
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

        public PaisDto build() {
            return new PaisDto(this.codigo, this.descricao);
        }

    }

    public static class Representation {

        public static PaisDto toRepresentation(final Pais pais) {
            return Builder.create()
                    .codigo(pais.getCodigo())
                    .descricao(pais.getDescricao())
                    .build();
        }

        public static List<PaisDto> toRepresentarion(final List<Pais> paises) {

            final List<PaisDto> paisesDto = new ArrayList<>();

            for (Pais pais : paises) {
                paisesDto.add(toRepresentation(pais));
            }

            return paisesDto;
        }
    }
}
