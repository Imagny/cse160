public class KToP3 {
	
	public static void main(String[] args) {
		System.out.println("Kilograms      Pounds");
		for (int i = 1; i < 11; i++) {
			System.out.print(i + "     ");
			System.out.printf("%.3f\n",(i * 1.609));
		}
	}

}