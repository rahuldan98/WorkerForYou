package com.org.workerforyou.dto;

import javax.persistence.Id;

import com.org.workerforyou.model.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
public class WorkerDto {

	
	private Integer id;
	private String name;
	private Role role;
}
