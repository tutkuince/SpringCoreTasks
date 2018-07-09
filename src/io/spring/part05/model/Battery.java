package io.spring.part05.model;

public class Battery extends Product {
	public boolean rechargeable;

	public Battery() {
		super();
	}

	public Battery(String name, double price, double discount) {
		super(name, price, discount);
	}

	public boolean isRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}

}
