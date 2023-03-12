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
@Table(name = "contratos")
public class Contrato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "numero_de_contrato", length = 4)
	// @Pattern(regexp = "[6][0-9]{8}", message = "debe tener 4 digitos como maximo")
	private Integer numeroDeContrato;

	@Column(name = "fecha_de_inicio", length = 15)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date fechaDeInicio;

	@Column(name = "duracion", length = 4)
	private Integer duracion;

	@Column(name = "valor_de_alquiler_por_dia", length = 5)
	private Integer valorDeAlquilerPorDia;

	@Column(name = "valor_total_del_contrato", length = 10)
	private Integer valorTotalDelContrato;

	@Column(name = "valor_cancelado", length = 10)
	private Integer valorCancelado;

	@Column(name = "valor_restante", length = 10)
	private Integer valorRestante;

	@Column(name = "dias_de_mora", length = 10)
	private Integer diasDeMora;

	@Column(name = "saldo_en_mora", length = 10)
	private Integer saldoEnMora;

	@Column(name = "saldo_total", length = 10)
	private Integer saldoTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumeroDeContrato() {
		return numeroDeContrato;
	}

	public void setNumeroDeContrato(Integer numeroDeContrato) {
		this.numeroDeContrato = numeroDeContrato;
	}

	public Date getFechaDeInicio() {
		return fechaDeInicio;
	}

	public void setFechaDeInicio(Date fechaDeInicio) {
		this.fechaDeInicio = fechaDeInicio;
	}

	public Integer getDuracion() {
		return duracion;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public Integer getValorDeAlquilerPorDia() {
		return valorDeAlquilerPorDia;
	}

	public void setValorDeAlquilerPorDia(Integer valorDeAlquilerPorDia) {
		this.valorDeAlquilerPorDia = valorDeAlquilerPorDia;
	}

	public Integer getValorTotalDelContrato() {
		return valorTotalDelContrato;
	}

	public void setValorTotalDelContrato(Integer valorTotalDelContrato) {
		this.valorTotalDelContrato = valorTotalDelContrato;
	}

	public Integer getValorCancelado() {
		return valorCancelado;
	}

	public void setValorCancelado(Integer valorCancelado) {
		this.valorCancelado = valorCancelado;
	}

	public Integer getValorRestante() {
		return valorRestante;
	}

	public void setValorRestante(Integer valorRestante) {
		this.valorRestante = valorRestante;
	}

	public Integer getDiasDeMora() {
		return diasDeMora;
	}

	public void setDiasDeMora(Integer diasDeMora) {
		this.diasDeMora = diasDeMora;
	}

	public Integer getSaldoEnMora() {
		return saldoEnMora;
	}

	public void setSaldoEnMora(Integer saldoEnMora) {
		this.saldoEnMora = saldoEnMora;
	}

	public Integer getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(Integer saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	@Override
	public String toString() {
		return "Contrato [id=" + id + ", numeroDeContrato=" + numeroDeContrato + ", fechaDeInicio=" + fechaDeInicio
				+ ", duracion=" + duracion + ", valorDeAlquilerPorDia=" + valorDeAlquilerPorDia
				+ ", valorTotalDelContrato=" + valorTotalDelContrato + ", valorCancelado=" + valorCancelado
				+ ", valorRestante=" + valorRestante + ", diasDeMora=" + diasDeMora + ", saldoEnMora=" + saldoEnMora
				+ ", saldoTotal=" + saldoTotal + "]";
	}
	
	

}
