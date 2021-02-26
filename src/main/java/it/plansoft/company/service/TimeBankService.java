package it.plansoft.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.plansoft.company.model.TimeBank;
import it.plansoft.company.repository.TimeBankRepository;

@Service
public class TimeBankService {

	@Autowired
	private TimeBankRepository repository;

	public List<TimeBank> getEmployees() {
		return repository.findAll();
	}
	
	public void maxHours(Long id, int maxHours) {
		for (TimeBank timeBank : repository.findAll()) {
			TimeBank timeBankEmployee = repository.findByIdEmployee(id);
			if(timeBankEmployee != null) {
				timeBankEmployee.setMaxHoursForDay(maxHours);
			}
		}
	}

	public void add(Long id, Long idLevel) {
		repository.save(new TimeBank(id, idLevel));
	}
}