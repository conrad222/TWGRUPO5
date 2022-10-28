package com.curso.spring.ejemplo002;

import org.springframework.stereotype.Component;

//@Service
@Component
public class IRPFServiceImp implements IRPFService{

	public IRPFServiceImp() {
		System.out.println("... instanciando irpf servic imp");
	}
	@Override
	public double calcularIRPF() {
		return 10.0;
	}

}
