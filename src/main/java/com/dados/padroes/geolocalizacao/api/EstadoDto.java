package com.dados.padroes.geolocalizacao.api;

import com.dados.padroes.geolocalizacao.model.Estado;
import java.util.ArrayList;
import java.util.List;

public final class EstadoDto {

    private Integer codigo;
    private String descricao;

    private EstadoDto() {
    }

    private EstadoDto(Integer codigo, String descricao) {
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

        public EstadoDto build() {
            return new EstadoDto(this.codigo, this.descricao);
        }

    }

    public static class Representation {

        public static EstadoDto toRepresentation(final Estado estado) {
            return Builder.create()
                    .codigo(estado.getCodigo())
                    .descricao(estado.getDescricao())
                    .build();
        }

        public static List<EstadoDto> toRepresentarion(final List<Estado> estadoes) {

            final List<EstadoDto> estadosDto = new ArrayList<>();

            for (Estado estado : estadoes) {
                estadosDto.add(toRepresentation(estado));
            }

            return estadosDto;
        }
    }
}
