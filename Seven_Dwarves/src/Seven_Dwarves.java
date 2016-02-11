import java.util.Scanner;
public class Seven_Dwarves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, num4, num5, num6, num7, num8, num9;
		int count=0;
		Scanner scan = new Scanner(System.in);
		do{
		do {
			System.out.print("Enter Number of Dwarves1 (1-99) : ");
			num1 = scan.nextInt();
		} while (num1 <= 0 || num1 >= 99);
		do {
			System.out.print("Enter Number of Dwarves2 (1-99) : ");
			num2 = scan.nextInt();
			if (num2 <= 0 || num2 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (num2 == num1) {
				System.out.println("Number2 Duplicate Number1. Please enter again!!!");
			}
		} while (num2 <= 0 || num2 >= 9229 || num2 == num1);
		do {
			System.out.print("Enter Number of Dwarves3 (1-99) : ");
			num3 = scan.nextInt();
			if (num3 <= 0 || num3 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (num3 == num1) {
				System.out.println("Number3 Duplicate Number1. Please enter again!!!");
			} else if (num3 == num2) {
				System.out.println("Number3 Duplicate Number2. Please enter again!!!");
			}
		} while (num3 <= 0 || num3 >= 99 || num3 == num1 || num3 == num2);
		do {
			System.out.print("Enter Number of Dwarves4 (1-99) : ");
			num4 = scan.nextInt();
			if (num4 <= 0 || num4 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (num4 == num1) {
				System.out.println("Number4 Duplicate Number1. Please enter again!!!");
			} else if (num4 == num2) {
				System.out.println("Number4 Duplicate Number2. Please enter again!!!");
			} else if (num4 == num3) {
				System.out.println("Number4 Duplicate Number3. Please enter again!!!");
			}
		} while (num4 <= 0 || num4 >= 99 || num4 == num1 || num4 == num2 || num4 == num3);
		do {
			System.out.print("Enter Number of Dwarves5 (1-99) : ");
			num5 = scan.nextInt();
			if (num5 <= 0 || num5 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (num5 == num1) {
				System.out.println("Number5 Duplicate Number1. Please enter again!!!");
			} else if (num5 == num2) {
				System.out.println("Number5 Duplicate Number2. Please enter again!!!");
			} else if (num5 == num3) {
				System.out.println("Number5 Duplicate Number3. Please enter again!!!");
			} else if (num5 == num4) {
				System.out.println("Number5 Duplicate Number4. Please enter again!!!");
			}
		} while (num5 <= 0 || num5 >= 99 || num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4);
		do {
			System.out.print("Enter Number of Dwarves6 (1-99) : ");
			num6 = scan.nextInt();
			if (num6 <= 0 || num6 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (num6 == num1) {
				System.out.println("Number6 Duplicate Number1. Please enter again!!!");
			} else if (num6 == num2) {
				System.out.println("Number6 Duplicate Number2. Please enter again!!!");
			} else if (num6 == num3) {
				System.out.println("Number6 Duplicate Number3. Please enter again!!!");
			} else if (num6 == num4) {
				System.out.println("Number6 Duplicate Number4. Please enter again!!!");
			} else if (num6 == num5) {
				System.out.println("Number6 Duplicate Number5. Please enter again!!!");
			}
		} while (num6 <= 0 || num6 >= 99 || num6 == num1 || num6 == num2 || num6 == num3 || num6 == num4 || num6 == num5);
		do {
			System.out.print("Enter Number of Dwarves7 (1-99) : ");
			num7 = scan.nextInt();
			if (num7 <= 0 || num7 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (num7 == num1) {
				System.out.println("Number7 Duplicate Number1. Please enter again!!!");
			} else if (num7 == num2) {
				System.out.println("Number7 Duplicate Number2. Please enter again!!!");
			} else if (num7 == num3) {
				System.out.println("Number7 Duplicate Number3. Please enter again!!!");
			} else if (num7 == num4) {
				System.out.println("Number7 Duplicate Number4. Please enter again!!!");
			} else if (num7 == num5) {
				System.out.println("Number7 Duplicate Number5. Please enter again!!!");
			} else if (num7 == num6) {
				System.out.println("Number7 Duplicate Number6. Please enter again!!!");
			}
		} while (num7 <= 0 || num7 >= 99 || num7 == num1 || num7 == num2 || num7 == num3 || num7 == num4 || num7 == num5 || num7 == num6);
		do {
			System.out.print("Enter Number of Dwarves8 (1-99) : ");
			num8 = scan.nextInt();
			if (num8 <= 0 || num8 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (num8 == num1) {
				System.out.println("Number8 Duplicate Number1. Please enter again!!!");
			} else if (num8 == num2) {
				System.out.println("Number8 Duplicate Number2. Please enter again!!!");
			} else if (num8 == num3) {
				System.out.println("Number8 Duplicate Number3. Please enter again!!!");
			} else if (num8 == num4) {
				System.out.println("Number8 Duplicate Number4. Please enter again!!!");
			} else if (num8 == num5) {
				System.out.println("Number8 Duplicate Number5. Please enter again!!!");
			} else if (num8 == num6) {
				System.out.println("Number8 Duplicate Number6. Please enter again!!!");
			} else if (num8 == num7) {
				System.out.println("Number8 Duplicate Number7. Please enter again!!!");
			}
		} while (num8 <= 0 || num8 >= 99 || num8 == num1 || num8 == num2 || num8 == num3 || num8 == num4 || num8 == num5 || num8 == num6
				|| num8 == num7);
		do {
			System.out.print("Enter Number of Dwarves9 (1-99) : ");
			num9 = scan.nextInt();
			if (num9 <= 0 || num9 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (num9 == num1) {
				System.out.println("Number9 Duplicate Number1. Please enter again!!!");
			} else if (num9 == num2) {
				System.out.println("Number9 Duplicate Number2. Please enter again!!!");
			} else if (num9 == num3) {
				System.out.println("Number9 Duplicate Number3. Please enter again!!!");
			} else if (num9 == num4) {
				System.out.println("Number9 Duplicate Number4. Please enter again!!!");
			} else if (num9 == num5) {
				System.out.println("Number9 Duplicate Number5. Please enter again!!!");
			} else if (num9 == num6) {
				System.out.println("Number9 Duplicate Number6. Please enter again!!!");
			} else if (num9 == num7) {
				System.out.println("Number9 Duplicate Number7. Please enter again!!!");
			} else if (num9 == num8) {
				System.out.println("Number9 Duplicate Number7. Please enter again!!!");
			}
		} while (num9 <= 0 || num9 >= 99 || num9 == num1 || num9 == num2 || num9 == num3 || num9 == num4 || num9 == num5 || num9 == num6 || num9 == num7
				|| num9 == num8);
		if ((num3 + num4 + num5 + num6 + num7 + num8 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num2 + num4 + num5 + num6 + num7 + num8 + num9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num2 + num3 + num5 + num6 + num7 + num8 + num9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num2 + num3 + num4 + num6 + num7 + num8 + num9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num2 + num3 + num4 + num5 + num7 + num8 + num9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num2 + num3 + num4 + num5 + num6 + num8 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num2 + num3 + num4 + num5 + num6 + num7 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num2 + num3 + num4 + num5 + num6 + num7 + num8) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			count=0;
		} else if ((num1 + num4 + num5 + num6 + num7 + num8 + num9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num3 + num5 + num6 + num7 + num8 + num9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num3 + num4 + num6 + num7 + num8 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num3 + num4 + num5 + num7 + num8 + num9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num3 + num4 + num5 + num6 + num8 + num9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num3 + num4 + num5 + num6 + num7 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num3 + num4 + num5 + num6 + num7 + num8) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			count=0;
		} else if ((num1 + num2 + num5 + num6 + num7 + num8 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num4 + num6 + num7 + num8 + num9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num4 + num5 + num7 + num8 + num9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num4 + num5 + num6 + num8 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num4 + num5 + num6 + num7 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num4 + num5 + num6 + num7 + num8) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			count=0;
		} else if ((num1 + num2 + num3 + num6 + num7 + num8 + num9) == 100) {
			System.out.println("Output :");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num3 + num5 + num7 + num8 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num3 + num5 + num6 + num8 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num3 + num5 + num6 + num7 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num3 + num5 + num6 + num7 + num8) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			count=0;
		} else if ((num1 + num2 + num3 + num4 + num7 + num8 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num3 + num4 + num6 + num8 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num3 + num4 + num6 + num7 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num3 + num4 + num6 + num7 + num8) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			count=0;
		} else if ((num1 + num2 + num3 + num4 + num5 + num8 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves8 :" + num8);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num3 + num4 + num5 + num7 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num3 + num4 + num5 + num7 + num8) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves7 :" + num7);
			System.out.println("Dwarves8 :" + num8);
			count=0;
		} else if ((num1 + num2 + num3 + num4 + num5 + num6 + num9) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves9 :" + num9);
			count=0;
		} else if ((num1 + num2 + num3 + num4 + num5 + num6 + num8) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves8 :" + num8);
			count=0;
		} else if ((num1 + num2 + num3 + num4 + num5 + num6 + num7) == 100) {
			System.out.println("-------Output--------");
			System.out.println("Dwarves1 :" + num1);
			System.out.println("Dwarves2 :" + num2);
			System.out.println("Dwarves3 :" + num3);
			System.out.println("Dwarves4 :" + num4);
			System.out.println("Dwarves5 :" + num5);
			System.out.println("Dwarves6 :" + num6);
			System.out.println("Dwarves7 :" + num7);
			count=0;
		} else {
			System.out.println("Summary of number not equal 100.!!!");
			System.out.println("Please take again.!!!");
			count++;
		}
		}while(count == 1);
	}
}
