import java.util.Scanner;

class Fibonacci {
	public static void main(String[] args) {

		int n = 0, firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");
		System.out.println("Enter n value");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; ++i) {
			System.out.print(firstTerm + ", ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}