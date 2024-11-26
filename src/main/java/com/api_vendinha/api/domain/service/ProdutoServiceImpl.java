package com.api_vendinha.api.domain.service;

import com.api_vendinha.api.Infrastructure.repository.ProdutoRepository;
import com.api_vendinha.api.Infrastructure.repository.UserRepository;
import com.api_vendinha.api.domain.dtos.request.ProdutoRequestDto;
import com.api_vendinha.api.domain.dtos.request.UserRequestDto;
import com.api_vendinha.api.domain.dtos.response.ProdutoResponseDto;
import com.api_vendinha.api.domain.dtos.response.UserResponseDto;
import com.api_vendinha.api.domain.entities.Produto;
import com.api_vendinha.api.domain.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoServiceInterface {

    private final ProdutoRepository produtoRepository;



    //@Autowired
    //public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        //this.produtoRepository = produtoRepository;
    //}

    /*@Override
    public ProdutoResponseDto save(ProdutoRequestDto produtoRequestDto) {
        Produto produto = new Produto();
        produto.setId(produtoRequestDto.getId());
        produto.setIs_active(Boolean.TRUE);
        produto.setName(produtoRequestDto.getName());
        produto.setPreco(produtoRequestDto.getPreco());
        produto.setQuantidade(produtoRequestDto.getQuantidade());

        // Salva o usuário no banco de dados e obtém a entidade persistida com o ID gerado.
        Produto savedProduto = produtoRepository.save(produto);


        return this.getProdutoResponseDto(savedProduto);*/

}
