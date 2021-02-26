package it.plansoft.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.plansoft.company.repository.TimeBankRepository;

@Service
public class TimeBankService {

	@Autowired
	private TimeBankRepository repository;
}
