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
import br.com.gestaotrading.domain.Corretora;
import br.com.gestaotrading.repository.CorretoraRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@RequestMapping("/corretoras")
@RestController
public class CorretoraController {
	
	@Autowired
	private CorretoraRepository corretoraRepository;
	
	@GetMapping
	@ApiOperation(value = "", authorizations =  { @Authorization(value="Bearer") })
	public Page<Corretora> getPage(Pageable pageable) {
		return corretoraRepository.findAll(pageable);
	}
	
	@GetMapping("/all")
	@ApiOperation(value = "", authorizations =  { @Authorization(value="Bearer") })
	public List<Corretora> getAll() {
		return corretoraRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "", authorizations =  { @Authorization(value="Bearer") })
	public Corretora save(@RequestBody Corretora banca) {
		return corretoraRepository.save(banca);
	}
	
	@PutMapping("/{id}")
	@ApiOperation(value = "", authorizations =  { @Authorization(value="Bearer") })
	public Corretora update(@RequestBody Corretora banca, @PathVariable Long id) {
		banca.setId(id);
		return corretoraRepository.save(banca);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation(value = "", authorizations =  { @Authorization(value="Bearer") })
	public void delete(@PathVariable Long id) {
		corretoraRepository.deleteById(id);
	}
		
}
