package br.com.lp3.trabalho.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lp3.trabalho.dto.ProdutoDTO;
import br.com.lp3.trabalho.model.Produto;
import br.com.lp3.trabalho.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	public ProdutoDTO findById(Integer id) {
		Optional<Produto> oProduto = produtoRepository.findById(id);
		if (oProduto != null && oProduto.isPresent()) {
			Produto produto = oProduto.get();
			ProdutoDTO produtoDTO = new ProdutoDTO(produto.getId(), produto.getNome(), produto.getDescricao(),produto.getValor(),produto.getFornecedor());
			return produtoDTO;
		} else {
			return null;
		}
		
	}
	
	public ProdutoDTO saveProduto(ProdutoDTO produtoDTO) {
		Produto produto = new Produto(produtoDTO.getId(), produtoDTO.getNome(), produtoDTO.getDescricao(),produtoDTO.getValor(),produtoDTO.getFornecedor());
		produto = produtoRepository.save(produto);
		produtoDTO.setId(produto.getId());
		return produtoDTO;
	}
	
	public ProdutoDTO delete(ProdutoDTO produtoDTO) {
		Produto produto = new Produto(produtoDTO.getId(), produtoDTO.getNome(), produtoDTO.getDescricao(),produtoDTO.getValor(),produtoDTO.getFornecedor());
	    produtoRepository.delete(produto);
	    return produtoDTO;
	   }
	
	public List<ProdutoDTO> findAll() {
		Iterable <Produto> iProdutos = produtoRepository.findAll();
		List<ProdutoDTO> ps = new ArrayList<ProdutoDTO>();
			for(Produto p : iProdutos) {
				ProdutoDTO pDTO = new ProdutoDTO();
				pDTO.setId(p.getId());
				pDTO.setNome(p.getNome());
				pDTO.setDescricao(p.getDescricao());
				pDTO.setValor(p.getValor());
				pDTO.setFornecedor(p.getFornecedor());
			}
			
			return ps;
		}

	public ProdutoDTO update(ProdutoDTO produtoDTO) {
		Produto produto = new Produto(produtoDTO.getId(), produtoDTO.getNome(), produtoDTO.getDescricao(),produtoDTO.getValor(),produtoDTO.getFornecedor());
	    produto = produtoRepository.update(produto);
	    produtoDTO.setId(produto.getId());
	    return produtoDTO;
	   }
}
