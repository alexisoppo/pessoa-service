package br.com.brasilprev.pessoaservice.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Pessoa {

	@Id
	private Long id;
	
	private String nome;
	
	private String cpf;
	
	private LocalDate dataNascimento;
}
