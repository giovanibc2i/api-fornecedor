package br.com.lp3.trabalho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lp3.trabalho.dto.ProdutoDTO;
import br.com.lp3.trabalho.service.ProdutoService;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<ProdutoDTO> findProdutoById(@PathVariable Integer id) {
		ProdutoDTO produtoDTO = produtoService.findById(id);
		if (produtoDTO != null) {
			return new ResponseEntity<ProdutoDTO>(produtoDTO, HttpStatus.OK);
		} else {
			return new ResponseEntity<ProdutoDTO>(produtoDTO, HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public ResponseEntity<ProdutoDTO> saveProduto(@RequestBody ProdutoDTO produtoDTO) {
		produtoDTO = produtoService.saveProduto(produtoDTO);
		if (produtoDTO != null) {
			return new ResponseEntity<ProdutoDTO>(produtoDTO, HttpStatus.OK);
		} else {
			return new ResponseEntity<ProdutoDTO>(produtoDTO, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/produto/{id}")
	public ResponseEntity<ProdutoDTO> deleteProduto(@RequestBody ProdutoDTO produtoDTO) {
	      produtoDTO = produtoService.delete(produtoDTO);
			if (produtoDTO != null) {
				return new ResponseEntity<ProdutoDTO>(produtoDTO, HttpStatus.OK);
			} else {
				return new ResponseEntity<ProdutoDTO>(produtoDTO, HttpStatus.INTERNAL_SERVER_ERROR);
			}
	   }
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public ResponseEntity<ProdutoDTO> findProdutoAll() {
		List<ProdutoDTO> produtoDTO = produtoService.findAll();
		if (produtoDTO != null) {
			return new ResponseEntity<ProdutoDTO>(HttpStatus.OK);
		} else {
			return new ResponseEntity<ProdutoDTO>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/produto/{id}")
	public ResponseEntity<ProdutoDTO> updateProduto(@RequestBody ProdutoDTO produtoDTO) {
	      produtoDTO = produtoService.update(produtoDTO);
			if (produtoDTO != null) {
				return new ResponseEntity<ProdutoDTO>(produtoDTO, HttpStatus.OK);
			} else {
				return new ResponseEntity<ProdutoDTO>(produtoDTO, HttpStatus.INTERNAL_SERVER_ERROR);
			}
	   }
	
}
