package com.org.workerforyou.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.org.workerforyou.dto.WorkerDto;
import com.org.workerforyou.model.Customer;
import com.org.workerforyou.model.Worker;
import com.org.workerforyou.service.IWorkerService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class WorkerController {

	private IWorkerService workerService;

	
	public ResponseEntity<Worker> register(WorkerDto workerDto) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(workerService.register(workerDto),HttpStatus.CREATED);
	}

	
	public ResponseEntity<Worker> view(Integer id) {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(workerService.view(id),HttpStatus.CREATED);
	}

	
	public ResponseEntity< List<Worker>> viewAll() {
		// TODO Auto-generated method stub
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
