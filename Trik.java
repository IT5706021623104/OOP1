import java.util.Scanner;
import java.lang.*;

public class Trik {
	public static void main(String[] args) {
		String ch;
		int A = 1;
		int B = 0;
		int C = 0;
		int temp=0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("Enter character (A,B or C) : ");
			ch1 = scan.nextLine();
			if(ch.length() > 50){
				System.out.println("Invalid input. Please enter again!!!");
			}
		} while (ch.length() > 50000);
		for (int i = 0; i < ch.length(); i++) {
			if (ch.charAt(i) == 'A' || ch.charAt(i) == 'a') {
				temp = A;
				A = B;
				B = temp;
			} else if (ch.charAt(i) == 'B' || ch.charAt(i) == 'b') {
				temp = B;
				B = C;
				C = temp;
			} else if (ch.charAt(i) == 'C' || ch.charAt(i) == 'c') {
				temp = A;
				A = C;
				C = temp;
			}
		}
		if (A == 1) {
			System.out.println("Ball in glass : 1");
		} else if (B == 1) {
			System.out.println("Ball in glass : 2");
		} else if (C == 1) {
			System.out.println("Ball in glass : 3");
		}
	}
}
