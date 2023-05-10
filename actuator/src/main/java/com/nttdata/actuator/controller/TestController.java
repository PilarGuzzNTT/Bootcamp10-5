package com.nttdata.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
@RequestMapping("/api/")
public class TestController {
	
	private Counter counter;
	
	public TestController (MeterRegistry reg) {
		this.counter = Counter.builder("invocaciones.hello")
				.description("Invocaiones totales del endpoint hello world")
				.register(reg);
	}
	
	
	@GetMapping("/hello")
	public String helloWord() {
		counter.increment();
		return "Hello ";
	}

}
