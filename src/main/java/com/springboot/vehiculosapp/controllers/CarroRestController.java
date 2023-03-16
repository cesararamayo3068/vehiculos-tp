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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.springboot.vehiculosapp.models.Carro;
import com.springboot.vehiculosapp.repositories.CarroRepository;
import com.springboot.vehiculosapp.services.ICarroService;

@RestController
@RequestMapping("/api")
public class CarroRestController {

	@Autowired
	private ICarroService carroService;

	@PostMapping("/carro")
	public ResponseEntity<?> saveCarro(@RequestBody Carro carro) {
		Carro carroNuevo = null;
		Map<String, Object> response = new HashMap<>();
		try {
			carroNuevo = carroService.save(carro);
		}catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar el insert en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		response.put("mensaje", "El Carro fue creado con éxito!");
		response.put("carro", carroNuevo);
		return new ResponseEntity<Map<String, Object>> (response,HttpStatus.CREATED);
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

	public ResponseEntity<?> show(@PathVariable String placa) {
		Carro carro = null;
		Map<String, Object> response = new HashMap<>();

		try {
			carro = carroService.buscarPorPlaca(placa);
		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);

		}

		if (carro == null) {
			response.put("mensaje", "El carro ID:".concat(placa.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Carro>(carro, HttpStatus.OK);
	}

	@GetMapping("/carro")
	public List<Carro> getAllcarros() {

		return carroService.findAll();
	}

	@DeleteMapping("/carro/{placa}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String placa) {

		carroService.deleteporPlaca(placa);
	}

}
