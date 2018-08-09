package br.com.brasilprev.pessoaservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brasilprev.pessoaservice.model.Pessoa;
import br.com.brasilprev.pessoaservice.repository.PessoaRepository;

@RestController
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping("pessoas")
	public List<Pessoa> getAll() {
		return pessoaRepository.findAll();
	}
}
