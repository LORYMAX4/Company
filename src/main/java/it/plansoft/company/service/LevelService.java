package it.plansoft.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.plansoft.company.model.Level;
import it.plansoft.company.repository.LevelRepository;


@Service
public class LevelService extends BaseCrudService<LevelRepository, Level, Long>{

	@Autowired
	public LevelService(LevelRepository levelRepository) {
		super(levelRepository);
	}

}
