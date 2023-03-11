package com.springboot.vehiculosapp.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre" ,length = 15)
	private String nombre;
	
	@Column(name = "apellido" ,length = 15)
	private String apellido;
	
	@Column(name = "fecha_de_nacimiento" ,length = 15)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaDeNacimiento;

	@Column(name = "numero_de_identficacion" ,length = 10)
	private Integer numeroDeidentificacion;
	
	@Column(name = "fecha_venc_doc_identidad" ,length = 15)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaVencDocIdentidad;
	
	@Column(name = "numero_telefonico" ,length = 20)
	private String numeroTelefonico;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Integer getNumeroDeidentificacion() {
		return numeroDeidentificacion;
	}

	public void setNumeroDeidentificacion(Integer numeroDeidentificacion) {
		this.numeroDeidentificacion = numeroDeidentificacion;
	}

	public Date getFechaVencDocIdentidad() {
		return fechaVencDocIdentidad;
	}

	public void setFechaVencDocIdentidad(Date fechaVencDocIdentidad) {
		this.fechaVencDocIdentidad = fechaVencDocIdentidad;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaDeNacimiento="
				+ fechaDeNacimiento + ", numeroDeidentificacion=" + numeroDeidentificacion + ", fechaVencDocIdentidad="
				+ fechaVencDocIdentidad + ", numeroTelefonico=" + numeroTelefonico + "]";
	}
	
	
}
