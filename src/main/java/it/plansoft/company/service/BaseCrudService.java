package it.plansoft.company.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;

public class BaseCrudService<REPO extends JpaRepository<T, ID>, T, ID> implements IServiceCrud<T, ID> {

	private final static Logger log = LoggerFactory.getLogger(BaseCrudService.class);

	protected JpaRepository<T, ID> repository;

	public BaseCrudService(JpaRepository<T, ID> repository) {
		this.repository = repository;
	}

	@Override
	public List<T> getAll() {
		List<T> t = repository.findAll();
		log.info("fetch data {} ", t);
		return t;
	}

	@Override
	public Optional<T> getById(ID id) {
		Optional<T> t = repository.findById(id);
		log.info("fetch data {} ", t);
		return t;
	}

	@Override
	public T save(T entity) {
		return repository.save(entity);
	}

	@Override
	public T update(T entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(T entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteById(ID id) {
		repository.deleteById(id);
	}
}
