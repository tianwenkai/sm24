package com.woniu.pojo;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {

	private Integer driverid;
	private String drivername;
	private String dcode;
	private Date dcodefalse;
	private String status;
	private List<Sendcar> sendcars;
}
