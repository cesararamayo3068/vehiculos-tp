package com.springboot.vehiculosapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.vehiculosapp.models.Carro;

@Repository
public interface CarroRepository extends JpaRepository <Carro,Long>{
	 @Query("select c from Carro c where c.placa = ?1")
	 Carro findByPlaca(String placa);
	 
	 @Modifying
	 @Query("delete from Carro c where c.placa =:placa")
	 void deleteCarroByPlaca(@Param("placa") String placa);

}
