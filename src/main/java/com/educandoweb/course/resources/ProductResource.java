package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Produto;
import com.educandoweb.course.services.ServicoDeProduto;

@RestController
@RequestMapping(value="/products")
public class ProductResource {
	
	@Autowired
	private ServicoDeProduto service;
	
	@GetMapping
	public ResponseEntity<List<Produto>>findAll(){
		List<Produto>list= service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<Produto>findById(@PathVariable Long id){
		Produto obj= service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	

}
