package com.woniu.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.Driver;
import com.woniu.service.IDriverService;
import com.woniu.service.impl.DriverServiceImpl;

@Controller
@RequestMapping("driver")
public class DriverController {
	IDriverService ds = new DriverServiceImpl();
	
	@Test
	public void test() {
		List<Driver> driverList=ds.findAll();
		for (Driver driver : driverList) {
			System.out.println(driver);
		}
	}

}
