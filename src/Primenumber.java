import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int flag = 1;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				flag = 0;
				break;
			} else {
				flag = 1;
				continue;
			}
		}
		if (flag == 1) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}
}