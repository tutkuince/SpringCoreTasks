package io.spring.part07.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import io.spring.part04.model.Product;

@Component
@Scope("prototype")	// Creates a new bean instance each time when requested
@Lazy
public class ShoppingCart {
	private List<Product> items = new ArrayList<>();

	public void addItem(Product item) {
		items.add(item);
	}

	public List<Product> getItems() {
		return items;
	}
}
