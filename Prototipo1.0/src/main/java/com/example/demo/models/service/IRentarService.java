package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Rentar;
import com.example.demo.models.entity.pk.RentarPK;


public interface IRentarService {

	
	public List<Rentar> findAll();
	
	
	public Rentar findById(Long id); 
	
	
	public Rentar save(Rentar renta); 
	
	
	public void delete(Long id); 
}
