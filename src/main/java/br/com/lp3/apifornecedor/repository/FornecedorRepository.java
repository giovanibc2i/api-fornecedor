package br.com.lp3.apifornecedor.repository;

import br.com.lp3.apifornecedor.model.Fornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Long>{

}
