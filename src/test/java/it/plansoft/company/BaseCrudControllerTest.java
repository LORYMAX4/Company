package it.plansoft.company;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import it.plansoft.company.controller.ICrudController;
import it.plansoft.company.model.IDModel;
import it.plansoft.company.service.BaseCrudService;

public abstract class BaseCrudControllerTest<CONTROLLER extends ICrudController<MODEL, ID>, MODEL extends IDModel<ID>, ID>
		implements ICrudController<MODEL, ID> {

	CONTROLLER controller;
	BaseCrudService service;
	JpaRepository repository;

	public BaseCrudControllerTest() {

	}

	public BaseCrudControllerTest(CONTROLLER controller, BaseCrudService service, JpaRepository repository) {
		this.controller = controller;
		this.service = service;
		this.repository = repository;
	}

	protected abstract MODEL getInsertElement();

	@Override
	public Optional<MODEL> getById(ID id) {
		Optional<MODEL> r = controller.getById(id);
		assertNotNull(r);
		return r;
	}

	// TEST SUL SERVICE

	@Test
	protected void getServiceAll() throws Exception {
		List<MODEL> rlist = service.getAll();
		assertTrue(rlist.size() > 0);
	}

	@Test
	protected void getServiceById() throws Exception {
		List<MODEL> rlist = service.getAll();
		assertTrue(rlist.size() > 0);
		MODEL r = rlist.get(0);
		// get Data ById
		Optional<MODEL> e = service.getById(r.getId());
		assertNotNull(e);
		assertNotNull(e.get());
		// check di lettura id
		assertEquals(e.get().getId(), r.getId());
	}

	@Test
	protected void insert() throws Exception {
		MODEL m = getInsertElement();
		MODEL mi = (MODEL) service.save(m);
		Optional<MODEL> e = service.getById(mi.getId());
		assertNotNull(e);
		assertNotNull(e.get());
		assertEquals(e.get().getId(), mi.getId());
	}
}
