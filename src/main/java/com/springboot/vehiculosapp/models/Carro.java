package com.springboot.vehiculosapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "CARROS")
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "marca" ,length = 30)
	private String marca;

	@Column(name = "modelo" ,length = 30)
	private String modelo;

	@Column(name = "año" ,length = 4)
	private Integer anio;

	@Column(name = "color" ,length = 15)
	private String color;

	@Column(name = "tipo" ,length = 10)
	@Enumerated(EnumType.STRING)
	private Tipo tipo;

	public enum Tipo {
		SEDAN, HATCHBACK, SUV, CAMIONETA

	}

	@Column(name = "placa" ,length = 6)
	//@Pattern(regexp = "[6][0-9]{8}")
	private String placa;

	@Column(name = "cantidad_de_pasajeros" ,length = 4)
	private Integer cantidadDePasajeros;

	@Column(name ="kilometraje" ,length = 4)
	private Integer kilometraje;

	@Column(name = "aire_acondicionado" ,length = 3)
	private AireAcondicionado aireAcondicionado;

	public enum AireAcondicionado {
		SI, NO
	}
	
	@Column(name = "valor_por_dia" ,length = 4)
	private Integer valorPorDia;
	
	@Column(name = "contrato" ,length = 4)
	//@Pattern(regexp = "[6][0-9]{8}", message = "debe tener 4 digitos como maximo")
	private Integer contrato;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Integer getCantidadDePasajeros() {
		return cantidadDePasajeros;
	}

	public void setCantidadDePasajeros(Integer cantidadDePasajeros) {
		this.cantidadDePasajeros = cantidadDePasajeros;
	}

	public Integer getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}

	public AireAcondicionado getAireAcondicionado() {
		return aireAcondicionado;
	}

	public void setAireAcondicionado(AireAcondicionado aireAcondicionado) {
		this.aireAcondicionado = aireAcondicionado;
	}

	public Integer getValorPorDia() {
		return valorPorDia;
	}

	public void setValorPorDia(Integer valorPorDia) {
		this.valorPorDia = valorPorDia;
	}

	public Integer getContrato() {
		return contrato;
	}

	public void setContrato(Integer contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color
				+ ", tipo=" + tipo + ", placa=" + placa + ", cantidadDePasajeros=" + cantidadDePasajeros
				+ ", kilometraje=" + kilometraje + ", aireAcondicionado=" + aireAcondicionado + ", valorPorDia="
				+ valorPorDia + ", contrato=" + contrato + "]";
	}

	
     

}
