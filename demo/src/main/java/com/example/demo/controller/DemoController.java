package com.example.demo.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Demo;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.DemoRepository;

@RestController
public class DemoController {

	 
	 @Autowired
		private DemoRepository demoRepository;
	
		
	@RequestMapping(value="/itemdata",method=RequestMethod.GET)
		public List<Demo> getAllitems() {
			return demoRepository.findAll();
		}

	
	@RequestMapping(value="/itemdata/{id}",method=RequestMethod.GET)
	public ResponseEntity<Demo> getEmployeeById(@PathVariable(value = "id") Long itemId)
			throws ResourceNotFoundException {
		Demo item = demoRepository.findById(itemId)
				.orElseThrow(() -> new ResourceNotFoundException("Item not found for this id :: " + itemId));
		return ResponseEntity.ok().body(item);
	}
	
	
	
	@RequestMapping(value="/itemdatasort",method=RequestMethod.GET)
	public List<Demo> getAllitemdatasort() {
		return demoRepository.findAll()
				.stream().sorted(Comparator.comparingDouble(Demo::getPrice).reversed()).collect(Collectors.toList());
	}
	
    
}
