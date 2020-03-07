package com.woniu.pojo;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {

	private Integer managerid;
	private String username;
	private String password;
	private String role;
	private List<Emp> emps;
}
