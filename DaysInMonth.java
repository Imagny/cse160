import java.util.*;

public class DaysInMonth {

	public static int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Month: ");
		int month = sc.nextInt();
		if(month < 1 || month > 12) {
			System.out.println("Invalid Month");
		} else {
			System.out.print("Year: ");
			int year = sc.nextInt();
			int days;
			if(month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
				days = DAYS[1] + 1;
			} else {
				days = DAYS[month - 1];
			}
			System.out.println(MONTHS[month - 1] + " " + year + " has " + days + " days");
		}

	}

}