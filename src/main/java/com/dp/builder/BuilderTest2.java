package com.dp.builder;

import com.dp.builder.Car.CarBuilder;

public class BuilderTest2 {

	public static void main(String[] args) {
		Car car = new CarBuilder().engine("supreme").color("red").price(12.54f).build();
		System.out.println(car);
	}

}
