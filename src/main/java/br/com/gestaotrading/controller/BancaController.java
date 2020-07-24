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

import br.com.gestaotrading.domain.Banca;
import br.com.gestaotrading.repository.BancaRepository;

@RequestMapping("/bancas")
@RestController
public class BancaController {
	
	@Autowired
	private BancaRepository bancaRepository;
	
	
	@GetMapping
	public Page<Banca> getPage(Pageable pageable) {
		return bancaRepository.findAll(pageable);
	}
	
	@GetMapping("/all")
	public List<Banca> getAll() {
		return bancaRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Banca save(@RequestBody Banca banca) {
		return bancaRepository.save(banca);
	}
	
	@PutMapping("/{id}")
	public Banca update(@RequestBody Banca banca, @PathVariable Long id) {
		banca.setId(id);
		return bancaRepository.save(banca);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		bancaRepository.deleteById(id);
	}
	
}
