package com.dp.builder;

public class Car {
	
	static class CarBuilder{
		private String engine;
		private String color;
		private float price;
		CarBuilder(){
			
		}
		public Car build() {
			return new Car(this);
		}
		public CarBuilder engine(String engine) {
			this.engine = engine;
			return this;
		}
		public CarBuilder color(String color) {
			this.color = color;
			return this;
		}
		public CarBuilder price(float price) {
			this.price = price;
			return this;
		}
		
	}
	
	private String engine;
	private String color;
	private float price;
	public Car(CarBuilder carBuilder) {
		this.engine = carBuilder.engine;
		this.color = carBuilder.color;
		this.price = carBuilder.price;
	}
	public String getEngine() {
		return engine;
	}
	public String getColor() {
		return color;
	}
	public float getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", color=" + color + ", price=" + price + "]";
	}
	

}
