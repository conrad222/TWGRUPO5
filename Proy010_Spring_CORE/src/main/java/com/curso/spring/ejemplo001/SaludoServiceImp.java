package com.curso.spring.ejemplo001;

import java.util.logging.Logger;

public class SaludoServiceImp implements SaludoService{

	Logger logger = Logger.getLogger("SaludoServiceImp");
	
	private String cabeceraMensaje;
	
	
	public SaludoServiceImp() {
		logger.info(".... instanciamos el servicio");
		this.cabeceraMensaje="Hola";
	}
	
	public SaludoServiceImp(String cabecera) {
		logger.info(".... instanciamos el servicio");
		this.cabeceraMensaje= cabecera;
	}
	
	
	@Override
	public void saludar(String mensaje) {
		if(mensaje==null) {
			logger.severe("error gordo");
			throw new IllegalArgumentException("falta el mensaje viene null");
		}
		logger.fine("saludadon");
		logger.info(this.cabeceraMensaje + mensaje+" !!!!");
		
	}
	


}
