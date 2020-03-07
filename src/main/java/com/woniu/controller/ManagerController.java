package com.woniu.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.Manager;
import com.woniu.service.IManagerService;
import com.woniu.service.impl.ManagerServiceImpl;

@Controller
@RequestMapping("manager")
public class ManagerController {
	IManagerService ms = new ManagerServiceImpl();
	
	@Test
	public void test() {
		List<Manager> managerList=ms.findAll();
		for (Manager manager :managerList) {
			System.out.println(manager);
		}
	}

}
