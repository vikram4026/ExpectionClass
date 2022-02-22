package org.data;

import java.util.Scanner;

public class Try {
	public static void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("ie")) {
System.out.println("ie browser");
		}
		if (browser.equalsIgnoreCase("chrome")) {
System.out.println("chrome browser");
		}
		if (browser.equalsIgnoreCase("firefox")) {
System.out.println("firefox");
		}
		if (browser.equalsIgnoreCase("safari")) {
System.out.println("safari");
		}
		if (browser.equalsIgnoreCase("opera")) {
System.out.println("opera");
		}
	}

	public static void main(String[] args) {
		Try a = new Try();
		a.openBrowser("opera");

	}
}
