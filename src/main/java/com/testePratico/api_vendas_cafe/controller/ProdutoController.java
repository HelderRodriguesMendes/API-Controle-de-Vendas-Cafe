package com.testePratico.api_vendas_cafe.controller;

import com.testePratico.api_vendas_cafe.model.Produto;
import com.testePratico.api_vendas_cafe.service.ProdutoService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private ProdutoService produtoService;

    @GetMapping(value = "/findAll", produces = "application/json")
    public ResponseEntity<List<Produto>>getProdutos(){
        return new ResponseEntity<List<Produto>>(produtoService.getProdutos(), HttpStatus.OK);
    }
}
