package com.dados.padroes.geolocalizacao.model;

public final class Pais {
    
    private Integer codigo;
    
    private String descricao;

    public Pais(final Integer codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    private void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
