package com.woniu.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.Car;
import com.woniu.service.ICarService;
import com.woniu.service.impl.CarServiceImpl;

@Controller
@RequestMapping("car")
public class CarController {
	ICarService cs = new CarServiceImpl();
	
	@Test
	public void test() {
		//System.out.println(cs.findOne(99));
		List<Car> carList=cs.findAll();
		for (Car car : carList) {
			System.out.println(car);
		}
	}

}
