package com.testePratico.api_vendas_cafe.reposirory;

import com.testePratico.api_vendas_cafe.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
