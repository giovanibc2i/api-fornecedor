package br.com.lp3.apifornecedor.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.lp3.apifornecedor.dto;
import br.com.lp3.apifornecedor.service;

@RestController
@RequestMapping(value = "/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<FornecedorDTO> findClienteById(@PathVariable Long id) {
        FornecedorDTO fornecedorDTO = fornecedorService.findById(id);
        if (fornecedorDTO != null) {
            return new ResponseEntity<FornecedorDTO>(fornecedorDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<FornecedorDTO>(fornecedorDTO, HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public ResponseEntity<FornecedorDTO> saveFornecedor(@RequestBody FornecedorDTO fornecedorDTO) {
        fornecedorDTO = fornecedorService.saveFornecedor(fornecedorDTO);
        if (fornecedorDTO != null) {
            return new ResponseEntity<FornecedorDTO>(fornecedorDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<FornecedorDTO>(fornecedorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}