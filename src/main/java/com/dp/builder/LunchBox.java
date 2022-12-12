package com.dp.builder;

public class LunchBox {

	// Implementing builder pattern

	static class LunchBuilder {
		private String bread;
		private String salad;
		private String condiments;
		private String meat;

		LunchBuilder() {

		}

		public LunchBox build() {
			return new LunchBox(this);
		}

		public LunchBuilder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public LunchBuilder salad(String salad) {
			this.salad = salad;
			return this;
		}

		public LunchBuilder condiments(String condiments) {
			this.condiments = condiments;
			return this;
		}

		public LunchBuilder meat(String meat) {
			this.meat = meat;
			return this;
		}
	}
	private String bread;
	private String salad;
	private String condiments;
	private String meat;

	public LunchBox(LunchBuilder builder) {
		this.bread = builder.bread;
		this.salad = builder.salad;
		this.condiments = builder.condiments;
		this.meat = builder.meat;
	}

	public String getBread() {
		return bread;
	}

	public String getSalad() {
		return salad;
	}

	public String getCondiments() {
		return condiments;
	}

	public String getMeat() {
		return meat;
	}

}
