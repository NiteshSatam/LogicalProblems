import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();

		int rem = 0;
		int temp = number;
		int reverseNum = 0;

		while (number != 0) {
			rem = number % 10;
			reverseNum = reverseNum * 10 + rem;
			number = number / 10;
		}

		System.out.println("Reverse of " + temp + " is " + reverseNum);
	}

}
