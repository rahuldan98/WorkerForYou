package com.org.workerforyou.dto;

import javax.persistence.Id;

import com.org.workerforyou.model.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class WorkerDto {

	private String username;
	private Role role;
}
