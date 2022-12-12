package com.dp.builder;

import com.dp.builder.LunchBox.LunchBuilder;

public class BuilderTest {
	public static void main(String[] args) {
		/*
		 * LunchBox lunchBox = new LunchBox(); lunchBox.setBread("Wheat");
		 * lunchBox.setCondiments("Sugar"); lunchBox.setMeat("chicken");
		 * lunchBox.setSalad("veg");
		 */
		//LunchBox lunchBox = new LunchBox("Brown","veg","peanut butter", "chciken");
		LunchBox.LunchBuilder builder = new LunchBuilder();
		builder.bread("white").condiments("spice").meat("LAM");
		LunchBox lunchBox = builder.build();
		
		System.out.println(lunchBox.getBread());
		System.out.println(lunchBox.getCondiments());
		System.out.println(lunchBox.getMeat());
		System.out.println(lunchBox.getSalad());
	}

}
