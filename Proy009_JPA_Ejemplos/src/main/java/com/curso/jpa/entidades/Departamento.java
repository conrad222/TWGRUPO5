package com.curso.jpa.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENTS")
public class Departamento implements Serializable{

	@Id
	@Column(name="department_id")
	private Integer id;
	
	@Column(name="DEPARTMENT_NAME")
	private String nombreDepartamento;
	
	@Column(name="MANAGER_ID")
	private String managerId;
	
	@Column(name="LOCATION_ID")
	private String idLocalidad;

	public Departamento(Integer id, String nombreDepartamento, String managerId, String idLocalidad) {
		super();
		this.id = id;
		this.nombreDepartamento = nombreDepartamento;
		this.managerId = managerId;
		this.idLocalidad = idLocalidad;
	}

	public Departamento() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(String idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombreDepartamento=" + nombreDepartamento + ", managerId=" + managerId
				+ ", idLocalidad=" + idLocalidad + "]";
	}
	
	
	
	
	
}
