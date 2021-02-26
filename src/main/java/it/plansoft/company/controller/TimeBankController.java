package it.plansoft.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.plansoft.company.model.TimeBank;
import it.plansoft.company.service.TimeBankService;

@RestController
@RequestMapping("/timebank")
public class TimeBankController {

	@Autowired
	private TimeBankService service;
	
	@GetMapping	
	public List<TimeBank> getEmployee() {
		return service.getEmployees();
	}
	
	@PostMapping("/{idEmployee}/{idLevel}")
	public void add(@PathVariable("idEmployee") Long id, @PathVariable("idLevel") Long idLevel) {
		service.add(id, idLevel);
	}

	@PutMapping("/{idEmployee}/maxHours/{maxHours}")
	public void maxHours(@PathVariable("idEmployee") Long id, @PathVariable("maxHours") int maxHours) {
		service.maxHours(id, maxHours);
	}
}