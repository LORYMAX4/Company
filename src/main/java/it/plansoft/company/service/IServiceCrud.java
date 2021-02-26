package it.plansoft.company.service;

import java.util.List;
import java.util.Optional;

public interface IServiceCrud<T, ID> {

	public List<T> getAll();
	
	public Optional<T> getById(ID id);
	
	public T save(T entity);
	
	public T update(T entity);
	
	public void delete(T entity);
	
	public void deleteById(ID id);
}