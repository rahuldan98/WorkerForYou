package com.org.workerforyou.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.org.workerforyou.dto.WorkerDto;
import com.org.workerforyou.exception.DuplicateWorkerException;
import com.org.workerforyou.exception.WorkerNotFoundException;
import com.org.workerforyou.model.Customer;
import com.org.workerforyou.model.Worker;
import com.org.workerforyou.repository.IWorkerRespository;
import com.org.workerforyou.service.IWorkerService;
import com.org.workerforyou.util.converter.WorkerConverter;
import java.util.Set;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class WorkerServiceImpl implements IWorkerService {

	private IWorkerRespository workerRepository;
	private WorkerConverter workerConverter;

	@Override
	public Worker register(WorkerDto workerDto) {

		Optional<Worker> optionlWorker = workerRepository.findByUsername(workerDto.getUsername());
		
		if(optionlWorker.isPresent())
			throw new DuplicateWorkerException("Duplicate worker present");
		
		Worker worker = workerConverter.convert(workerDto);
		
		return workerRepository.save(worker);
	}

	@Override
	public Worker view(Integer id) {
		// TODO Auto-generated method stub
		return workerRepository.findById(id).orElseThrow(()->  new WorkerNotFoundException("worker not found"));
	}

	@Override
	public List<Worker> viewAll() {
		// TODO Auto-generated method stub
		return workerRepository.findAll();
	}

	@Override
	public Worker update(Integer id, WorkerDto workerdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Worker delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer acceptRequst(Integer requestId, Integer acceptanceFlag) {
		// TODO Auto-generated method stub
		return null;
	}

}
