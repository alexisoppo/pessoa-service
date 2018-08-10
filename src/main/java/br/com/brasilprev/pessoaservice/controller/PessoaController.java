package br.com.brasilprev.pessoaservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.OpAnd;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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
	
	@GetMapping("pessoas/{id}")
	public Pessoa get(@PathVariable("id") Long id) {
		Optional<Pessoa> optional = pessoaRepository.findById(id);
		
		return optional.isPresent() 
				? optional.get() 
						: null;
	}
}
