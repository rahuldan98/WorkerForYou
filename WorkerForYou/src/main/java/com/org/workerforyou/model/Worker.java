package com.org.workerforyou.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Worker {
	
	@Id
	private Integer id;
	private String name;
	private Role role;
	
}


