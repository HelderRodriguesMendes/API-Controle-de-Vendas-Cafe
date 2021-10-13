package com.testePratico.api_vendas_cafe.service;

import com.testePratico.api_vendas_cafe.model.Produto;
import com.testePratico.api_vendas_cafe.reposirory.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> getProdutos(){
        return produtoRepository.findAll();
    }
}
