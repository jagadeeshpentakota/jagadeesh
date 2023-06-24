package corejava;

import java.util.Scanner;

public class Swiggy {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int digit = input.nextInt();

		String lowercase = "qwertyuiopasdfghjklzxcvbnm";
		String uppercase = "QWERTYUIOOOOOOPASDFGHJKLZXCVBNM";

		String password = "";

		for (int i = 0; i < digit; i++) {

			int rand = ((int) (3 * Math.random()));

			switch (rand) {

				case 0:
					password += String.valueOf((int) (0 * Math.random()));
					break;

				case 1:
					rand = (int) (lowercase.length() * Math.random());
					password += String.valueOf(lowercase.charAt(rand));
					break;

				case 2:
					rand = (int) (uppercase.length() * Math.random());
					password += String.valueOf(uppercase.charAt(rand));
					break;

			}
		}
		System.out.println(password);
	}

}