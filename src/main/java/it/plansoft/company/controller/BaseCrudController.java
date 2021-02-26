package it.plansoft.company.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import it.plansoft.company.model.IDModel;
import it.plansoft.company.service.BaseCrudService;

public abstract class BaseCrudController<SERVICE extends BaseCrudService, MODEL extends IDModel<ID>, ID>
		implements ICrudController<MODEL, ID> {

	protected final static Logger log = LoggerFactory.getLogger(BaseCrudController.class);

	protected SERVICE service;

	public BaseCrudController(SERVICE service) {
		this.service = service;
	}

	@Override
	@GetMapping("/")
	public List<MODEL> getAll() {
		log.info("getAll");
		return service.getAll();
	}

	@Override
	@GetMapping("/{id}")
	public Optional<MODEL> getById(@PathVariable ID id) {
		log.info("getById");
		return service.getById(id);
	}

	@Override
	@PostMapping("/")
	public MODEL add(@RequestBody MODEL model) {
		log.info("add", model);
		return (MODEL) service.save(model);
	}

	@Override
	@PutMapping("/{id}")
	public MODEL update(@RequestBody MODEL model, @PathVariable ID id) {
		log.info("update", model, id);
		return (MODEL) service.update(model);
	}

	@Override
	@DeleteMapping("/")
	public void delete(MODEL model) {
		log.info("delete", model);
		service.delete(model);
	}

	@Override
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable ID id) {
		log.info("deleteById", id);
		service.deleteById(id);
	}
}
