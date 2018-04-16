package br.com.lp3.trabalho.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lp3.trabalho.dto.FornecedorDTO;
import br.com.lp3.trabalho.model.Fornecedor;
import br.com.lp3.trabalho.repository.FornecedorRepository;

@Service
public class FornecedorService {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;

	public FornecedorDTO findById(Long id) {
		Optional<Fornecedor> oFornecedor = fornecedorRepository.findById(id);
		if (oFornecedor != null && oFornecedor.isPresent()) {
			Fornecedor fornecedor = oFornecedor.get();
			FornecedorDTO fornecedorDTO = new FornecedorDTO(fornecedor.getId(), fornecedor.getNome(), fornecedor.getEndereco(),fornecedor.getCnpj(),fornecedor.getRazao_social());
			return fornecedorDTO;
		} else {
			return null;
		}
		
	}
	
	public FornecedorDTO saveFornecedor(FornecedorDTO fornecedorDTO) {
		Fornecedor fornecedor = new Fornecedor(fornecedorDTO.getId(), fornecedorDTO.getNome(), fornecedorDTO.getEndereco(),fornecedorDTO.getCnpj(),fornecedorDTO.getRazao_social());
		fornecedor = fornecedorRepository.save(fornecedor);
		fornecedorDTO.setId(fornecedor.getId());
		return fornecedorDTO;
	}
	
}
