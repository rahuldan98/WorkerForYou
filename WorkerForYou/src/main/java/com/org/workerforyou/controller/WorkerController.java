package com.org.workerforyou.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.workerforyou.dto.WorkerDto;
import com.org.workerforyou.model.Customer;
import com.org.workerforyou.model.Worker;
import com.org.workerforyou.service.IWorkerService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("/worker")
public class WorkerController {

	private IWorkerService workerService;

	@PostMapping("/register")
	public ResponseEntity<Worker> register( @RequestBody WorkerDto workerDto) {
		
		return new ResponseEntity<>(workerService.register(workerDto),HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Worker> view(@PathVariable Integer id) {
		
		return new ResponseEntity<>(workerService.view(id),HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity< List<Worker>> viewAll() {
		
		return new ResponseEntity<>(workerService.viewAll(),HttpStatus.CREATED);
	}

	
	public ResponseEntity<Worker> update(Integer id, WorkerDto workerdto) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ResponseEntity<Worker> delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ResponseEntity<Customer> acceptRequst(Integer requestId, Integer acceptanceFlag) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
