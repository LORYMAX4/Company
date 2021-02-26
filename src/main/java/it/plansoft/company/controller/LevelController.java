package it.plansoft.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.plansoft.company.model.Level;
import it.plansoft.company.service.LevelService;


@RestController
@RequestMapping("/level")
public class LevelController extends BaseCrudController<LevelService, Level, Long>{

	@Autowired
	public LevelController(LevelService service) {
		super(service);
	}

}
