package io.spring.part06;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.spring.part06.config.ShopConfiguration;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ShopConfiguration.class);

		System.out.println("FOR US");
		
		String alert = context.getMessage("alert.checkout", null, Locale.US);
		String alert_inventory = context.getMessage("alert.inventory.checkout",
				new Object[] { "[DVD-RW 3.0]", new Date() }, Locale.US);

		System.out.println("The I18N message for alert.checkout is: " + alert);
		System.out.println("The I18N message for alert.inventory.checkout is: " + alert_inventory);
		
		System.out.println("\nFOR GERMANY");
		
		alert = context.getMessage("alert.checkout", null, Locale.GERMANY);
		alert_inventory = context.getMessage("alert.inventory.checkout",
				new Object[] { "[DVD-RW 3.0]", new Date() }, Locale.GERMANY);
		
		System.out.println("The I18N message for alert.checkout is: " + alert);
		System.out.println("The I18N message for alert.inventory.checkout is: " + alert_inventory);
		
		context.close();
	}
}
