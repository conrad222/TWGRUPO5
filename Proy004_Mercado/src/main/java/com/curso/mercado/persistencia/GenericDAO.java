package com.curso.mercado.persistencia;

import java.util.List;

public interface GenericDAO<T> {
	//<T> tipo genérico
	public void add(T entidad);
	public List<T> getAll();
	
}
