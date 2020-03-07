package com.woniu.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
	
	private Integer cadid;
	private String carcode;
	private String carbrand;
	private String carcolor;
	private Integer carseat;
	private String carstatus;
	private List<Sendcar> sendcars;
	
}
