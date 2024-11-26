package com.api_vendinha.api.domain.dtos.request;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRequestDto {
    private Long id ;
    private String name ;
    private Integer quantidade;
    private BigInteger preco;
    private Boolean is_active;

    private List<ProdutoRequestDto> produtoRequestDtos = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigInteger getPreco() {
        return preco;
    }

    public void setPreco(BigInteger preco) {
        this.preco = preco;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }
}
