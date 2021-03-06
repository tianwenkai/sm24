package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Car;

public interface ICarService {

	void save(Car obj);

	void update(Car obj);

	void delete(Integer no);

	Car findOne(Integer no);

	List<Car> findAll();
}
