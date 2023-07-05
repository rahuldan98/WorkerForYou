package com.org.workerforyou.dto;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data   //getter setter
@AllArgsConstructor     //parameterized constructor

public class CustomerDto {


	private String name;
	
}
