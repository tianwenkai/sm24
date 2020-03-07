package com.woniu.pojo;

import java.util.List;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
	private Integer deptid;
	private String deptname;
	private Integer deptphone;
	private String deptstatus;
	private List<Emp> emps;

}
