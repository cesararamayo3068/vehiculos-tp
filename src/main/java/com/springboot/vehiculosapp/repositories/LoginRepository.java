package com.springboot.vehiculosapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.vehiculosapp.models.Login;

public interface LoginRepository extends JpaRepository <Login,Long>{
	
	public Login findByUsername(String username);

}
