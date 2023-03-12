package com.springboot.vehiculosapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.vehiculosapp.models.Carro;
import com.springboot.vehiculosapp.repositories.CarroRepository;

@Service
public class CarroServiceImpl implements ICarroService{
 
	@Autowired
	private CarroRepository carroRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Carro> findAll() {
		
		return (List<Carro>) carroRepository.findAll();
	}

}
