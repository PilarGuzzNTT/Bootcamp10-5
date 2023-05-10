package com.nttdata.temperatura;

public class Temperatura {
	
	private String temperatura;

	
	public Temperatura(String temperatura) {
		this.temperatura = temperatura;

		
	}
	
	public String cambio(Double grados) {
		Double grados1 = 0.0;
		String mensaje = "";
	//	0 °C × 9/5) + 32 = 32 °F
				switch(temperatura) {
				case "Fahrenheit":
					grados1 = (grados * (9/5)) + 32;
					mensaje = grados1 + "ºF";
					break;
				case "Celsius":
					grados1 = (grados - 32) * 5/9 ;
					mensaje = grados1 + "ºC";
					break;
				}
				return mensaje;
		
	}

}
