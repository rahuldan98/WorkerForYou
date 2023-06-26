package com.org.workerforyou.service;

import com.org.workerforyou.dto.WorkerDto;
import com.org.workerforyou.model.Worker;

public interface IWorkerService {
	
	public Worker register(WorkerDto workerDto);

	
}
