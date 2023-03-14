package com.springboot.vehiculosapp.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.springboot.vehiculosapp.models.Carro;
import com.springboot.vehiculosapp.repositories.CarroRepository;
import com.springboot.vehiculosapp.services.ICarroService;

@RestController
@RequestMapping("/api")
public class CarroRestController {
	
	@Autowired
	private ICarroService carroService;
	
	@PostMapping("/carro")
	@ResponseStatus(HttpStatus.CREATED)
	public Carro saveCarro(@RequestBody Carro carro) {

	

		return carroService.save(carro);
	}

	@PatchMapping("/carro/{placa}")
	@ResponseStatus(HttpStatus.OK) 
	public Carro update(@RequestBody Carro carro, @PathVariable String placa) {
		Carro carroActual = carroService.buscarPorPlaca(placa);
		carroActual.setPlaca(carro.getPlaca());
		carroActual.setMarca(carro.getMarca());
		carroActual.setModelo(carro.getModelo());
		carroActual.setAnio(carro.getAnio());
		carroActual.setColor(carro.getColor());
		carroActual.setTipo(carro.getTipo());
		carroActual.setCantidadDePasajeros(carro.getCantidadDePasajeros());
		carroActual.setKilometraje(carro.getKilometraje());
		carroActual.setAireAcondicionado(carro.getAireAcondicionado());
		carroActual.setValorPorDia(carro.getValorPorDia());

		return carroService.save(carroActual);
	}

	@GetMapping("/carro/{placa}")
	@ResponseStatus(HttpStatus.OK)
	public Carro show(@PathVariable String placa) {
		
		
		return carroService.buscarPorPlaca(placa);
	}

	@GetMapping("/carro")
	public List<Carro> getAllcarros() {
	
		return carroService.findAll();
	}

	@DeleteMapping("/carro/{placa}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String placa){
		
		carroService.deleteporPlaca(placa);
	}
	
	
	
}
