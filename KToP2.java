public class KToP2 {
	
	public static void main(String[] args) {
		System.out.println("Kilograms      Pounds");
		for (int i = 1, j = 20; i < 201; i += 2, j += 5) {
			System.out.print(i + "     ");
			System.out.printf("%.1f    ",(i * 2.2));
			System.out.print(j + "     ");
			System.out.printf("%.2f\n",(j / 2.2));
		}
	}

}