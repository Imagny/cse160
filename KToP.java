public class KToP {
	
	public static void main(String[] args) {
		System.out.println("Kilograms      Pounds");
		for (int i = 1; i < 201; i += 2) {
			System.out.print(i + "     ");
			System.out.printf("%.1f\n",(i * 2.2));
		}
	}

}