package com.springboot.vehiculosapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.vehiculosapp.models.Carro;

@Repository
public interface CarroRepository extends JpaRepository <Carro,Long>{
	
	 Carro findByPlaca(String placa);

}
