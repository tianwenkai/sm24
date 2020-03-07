package com.woniu.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.Emp;
import com.woniu.service.IEmpService;
import com.woniu.service.impl.EmpServiceImpl;

@Controller
@RequestMapping("emp")
public class EmpController {
	IEmpService es = new EmpServiceImpl();

	@Test
	public void test() {
		 System.out.println(es.findOne(1000));
		List<Emp> empList = es.findAll();
		for (Emp emp : empList) {
			System.out.println(emp);
		}
	}
}
