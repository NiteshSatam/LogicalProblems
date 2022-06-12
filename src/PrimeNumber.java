import java.util.Scanner;

public class PrimeNumber {

	static boolean isPrime(int number) {

		// Check if number is less than equal to 1
		if (number <= 1)
			return false;

		// Check if number is 2
		else if (number == 2)
			return true;

		// Check if n is a multiple of 2
		else if (number % 2 == 0)
			return false;

		// If not, then just check the odds
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();

		if (isPrime(number))
			System.out.println("Entered number is Prime Number");

		else
			System.out.println("Entered number is not a Prime Number");

	}

}
