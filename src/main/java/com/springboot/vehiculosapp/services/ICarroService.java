package com.springboot.vehiculosapp.services;

import java.util.List;

import com.springboot.vehiculosapp.models.Carro;

public interface ICarroService {
	
	public List<Carro> findAll();
	
	public Carro buscarPorPlaca(String placa);
	
	public Carro save(Carro carro);
	
	public void deleteporPlaca(String placa);
	
	
	
	
}
