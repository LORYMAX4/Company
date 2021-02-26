package it.plansoft.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.plansoft.company.service.TimeBankService;

@RestController
@RequestMapping("/timebank")
public class TimeBankController {
	
	@Autowired
	private TimeBankService service;
}