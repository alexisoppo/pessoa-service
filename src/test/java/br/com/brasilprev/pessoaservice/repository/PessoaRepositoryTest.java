package br.com.brasilprev.pessoaservice.repository;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.brasilprev.pessoaservice.model.Pessoa;

@Sql(value = "/load-database.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
@Sql(value = "/clean-database.sql", executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
@RunWith(SpringRunner.class)
@DataJpaTest
public class PessoaRepositoryTest {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Before
	public void setUp() {
		
	}
	
	@Test
	public void deve_retornar_o_pegador_do_tinder() {
		Optional<Pessoa> optional = pessoaRepository.findById(1l);
		Pessoa pessoa = optional.get();
		
		assertEquals(pessoa.getNome(), "Pegador do Tinder");
	}

}
