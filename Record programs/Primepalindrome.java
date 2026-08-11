package Excersice;
import java.util.Scanner;
public class Primepalindrome {
	static boolean isPrime(int n) {
	    if(n<=1) {
		return false;
	}
	for(int i=2;i<=n/2;i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
	}

	static boolean isPalindrome(int n) {
		int original = n;
		int reverse = 0;
		while(n != 0) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		}
		if(original == reverse) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		if (isPrime(n) && isPalindrome(n)) {
			System.out.println(n + " " +"is a primepalindrome");
		}else {
			System.out.println(n  +" " +"is not a primepalindrome");

		}
	}
 }

