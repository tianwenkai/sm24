package com.woniu.pojo;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sendcar {

	private Integer sendid;
	private Driver driver;
	private Car car;
	private Emp emp;
	private String sendcode;
	private Date datestart;
	private Date datelast;
	private String distance;
	private String cause;
	private String sendcarstatus;
	
}
