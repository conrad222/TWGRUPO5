package com.curso.spring.ejemplo002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.ejemplo001.NominaService;

@Service
public class NominaServiceImp implements NominaService{
	//inyecta en la variable de ref irpService una instancia de IRPFServiceImp
	@Autowired
	private IRPFService irpfService;
	
	public NominaServiceImp() {
		System.out.println("... constructor nsi");
	}
	@Override
	public void calcularNomina() {
		System.out.printf("... tu nomina es %f con un "+ " IRPF %5.3f %n", 233.0, irpfService.calcularIRPF());
		

	}

}
