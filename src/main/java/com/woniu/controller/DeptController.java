package com.woniu.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.Dept;
import com.woniu.service.IDeptService;
import com.woniu.service.impl.DeptServiceImpl;

@Controller
@RequestMapping("dept")
public class DeptController {
	IDeptService ds = new DeptServiceImpl();
	
	@Test
	public void test() {
		System.out.println(ds.findOne(99));
		List<Dept> deptList=ds.findAll();
		for (Dept dept : deptList) {
			System.out.println(dept);
		}
	}

}
