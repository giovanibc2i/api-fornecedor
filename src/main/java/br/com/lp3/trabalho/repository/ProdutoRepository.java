package br.com.lp3.trabalho.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lp3.trabalho.model.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

	Produto update(Produto produto);


}
