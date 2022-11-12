/**
 * 
 */
package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author DozalMagnaniDiego
 * @author ValenciaCruzJonathanJosué
 * @author RadillaMaldonadoDylanEmmanuel
 * @author OrtegaGarciaAlejandra
 * @author ReyesFarfánAndreaFernanda 
 *
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{

	
	@Id //Le agregamos la etiqueta de que sera la llave primaria 
	@Column(name="noCuenta", length=9, nullable=false,unique=true)
	private String noCuenta;
	@Column(name="contrasena")
	private String contrasena;
	@Column(name="nombre")
	private String nombre;
	@Column(name="paterno")
	private String paterno;
	@Column(name="materno")
	private String materno;
	@Column(name="carrera")
	private String carrera;
	@Column(name="celular")
	private String celular;
	@Column(name="correo")
	private String correo;
	@Column(name="rol")
	private Integer rol;
	@Column(name="activo")
	private Boolean activo;
	
	@OneToMany(mappedBy="usuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER )
	@JsonManagedReference 
	private List<Rentar> rentados = new ArrayList(); 
	
	private static final long serialVersionUID = 1L;
	
	public String getNoCuenta() {
		return noCuenta;
	}
	public void setNoCuenta(String noCuenta) {
		this.noCuenta = noCuenta;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Integer getRol() {
		return rol;
	}
	public void setRol(Integer rol) {
		this.rol = rol;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	public List<Rentar> getRentados() {
		return rentados;
	}
	public void setRentados(List<Rentar> rentados) {
		this.rentados = rentados;
	}
}
