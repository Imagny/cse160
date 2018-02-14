import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		reverse(123);
	}

	public static void reverse(int argX) {
		StringBuilder s = new StringBuilder(Integer.toString(argX));
		System.out.println(s.reverse());
	}


}