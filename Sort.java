import java.util.*;

public class Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		for(int i = 0; i < 3; i++) {
			System.out.print("Enter Number" + (i + 1) + ": ");
			int num = sc.nextInt();
			numbers[i] = num;
		}
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}