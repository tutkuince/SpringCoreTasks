package io.spring.part02.model;

public class Battery extends Product {
	public boolean rechargeable;

	public Battery() {
		super();
	}

	public Battery(String name, double price) {
		super(name, price);
	}

	public boolean isRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}

}
