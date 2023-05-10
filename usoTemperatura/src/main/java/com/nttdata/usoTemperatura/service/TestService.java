package com.nttdata.usoTemperatura.service;

import org.springframework.stereotype.Service;

import com.nttdata.temperatura.Temperatura;


@Service
public class TestService {
	
public TestService() {}
	
	public String usoTemperatura(String temperatura, Double grados) {
		Temperatura claseTemp = new Temperatura(temperatura);
		
		return claseTemp.cambio(grados);
	}


}
