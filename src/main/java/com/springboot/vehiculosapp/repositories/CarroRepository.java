package com.springboot.vehiculosapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.vehiculosapp.models.Carro;

@Repository
public interface CarroRepository extends JpaRepository <Carro,Long>{
	 @Query("select c from Carro c where c.placa = ?1")
	 Carro findByPlaca(String placa);

}
