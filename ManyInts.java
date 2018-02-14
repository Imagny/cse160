import java.util.*;

public class ManyInts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int posCount = 0;
		int negCount = 0;
		int sum = 0;
		int x;
		do {
			x = sc.nextInt();
			if(x > 0) {
				posCount++;
			}
			if(x < 0) {
				negCount++;
			}
			sum += x;

		} while(x != 0);
		System.out.println((double)(sum) / (posCount + negCount));
	}

}