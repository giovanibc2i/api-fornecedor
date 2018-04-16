package br.com.lp3.trabalho.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lp3.trabalho.model.Fornecedor;

@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Long>{

}
