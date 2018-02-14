import java.util.*;

public class BigMenu {

	public static void main(String[] args) {
		System.out.println("A – convert pounds to kilos");
		System.out.println("B – convert kilos to pounds");
		System.out.println("C – convert kilometers to miles");
		System.out.println("D – convert miles to kilometers");
		System.out.println("E - Exit");
		System.out.print("Enter your option: ");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		if(choice.equals("A")) {
			System.out.print("Enter a quantity in pounds:");
			double pounds = sc.nextDouble();
			System.out.println("Kilograms are " + (pounds * 0.45359237));
			return;
		} else if(choice.equals("B")) {
			System.out.print("Enter a quantity in kilograms:");
			double kilograms = sc.nextDouble();
			System.out.println("Pounds are " + (kilograms / 0.45359237));
			return;
		} else if(choice.equals("C")) {
			System.out.print("Enter a quantity in kilometers:");
			double kilometers = sc.nextDouble();
			System.out.println("Miles are " + (kilometers / 1.609344));
			return;
		} else if(choice.equals("D")) {
			System.out.print("Enter a quantity in miles:");
			double miles = sc.nextDouble();
			System.out.println("Kilometers are " + (miles * 1.609344));
			return;
		} else if(choice.equals("E")) {
			return;
		} else {
			System.out.println("Invalid Input");
		}
	}

}