package br.com.gestaotrading.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.gestaotrading.domain.Operacao;
import br.com.gestaotrading.repository.OperacaoRepository;

@RequestMapping("/operacoes")
@RestController
public class OperacaoController {
	
	@Autowired
	private OperacaoRepository operacaoRepository;
	
	@GetMapping
	public Page<Operacao> getPage(Pageable pageable) {
		return operacaoRepository.findAll(pageable);
	}
	
	@GetMapping("/all")
	public List<Operacao> getAll() {
		return operacaoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Operacao save(@RequestBody Operacao banca) {
		return operacaoRepository.save(banca);
	}
	
	@PutMapping("/{id}")
	public Operacao update(@RequestBody Operacao banca, @PathVariable Long id) {
		banca.setId(id);
		return operacaoRepository.save(banca);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		operacaoRepository.deleteById(id);
	}
		
}
