package com.kodilla.kodillasamplecalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaSamplecalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaSamplecalcApplication.class, args);
		SimpleCalculator calc = new SimpleCalculator();
		calc.addAToB(5,4);
		calc.subAFromB(4,9);
	}
}
