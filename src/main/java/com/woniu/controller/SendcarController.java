package com.woniu.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniu.pojo.Sendcar;
import com.woniu.service.ISendcarService;
import com.woniu.service.impl.SendcarServiceImpl;

@Controller
@RequestMapping("sendcar")
public class SendcarController {
	ISendcarService ss = new SendcarServiceImpl();
	
	//√ª”–≈‰÷√mapper
	@Test
	public void test() {
		List<Sendcar> sendcarList=ss.findAll();
		for (Sendcar sendcar : sendcarList) {
			System.out.println(sendcar);
		}
	}

}
