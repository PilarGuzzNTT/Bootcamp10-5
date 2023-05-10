package com.nttdata.usoTemperatura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.usoTemperatura.service.TestService;


@RequestMapping("/api/")
@RestController
public class TestController {
	
	TestService testService;
	
	public TestController(TestService testService) {
		this.testService = testService;
		
	}

	@GetMapping("temperatura/cambio/{temperatura}/{grados}")
	public String temperatura(@PathVariable("temperatura") String temperatura,
			@PathVariable("grados") Double grados) {
		return testService.usoTemperatura(temperatura, grados);
	}
	
}
