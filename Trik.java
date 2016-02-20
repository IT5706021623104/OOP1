import java.lang.*;
public class Trik {
	public static void main(String[] args)
	{
		String ch;
		int A = 1;
		int B = 0;
		int C = 0;
		int temp=0;
		String s1,s2;
		do {
			s1=JOptionPane.showInputDialog("Enter character (A,B or C) : ");
			ch = s1;
			if(ch.length() > 50){
				(null,"Invalid input. Please enter again!!!",null,JOptionPane.INFORMATION_MESSAGE);
			}
		} while (ch.length() > 50);
		character(A,B,C);
		for (int i = 0; i < ch.length(); i++) 
		{
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
	}
	public static void character(int A,int B,int C)
	{
	
		if (A == 1) {
			(null,"Ball in glass : 1",null, JOptionPane.INFORMATION_MESSAGE);
		} else if (B == 1) {
			(null,"Ball in glass : 2",null, JOptionPane.INFORMATION_MESSAGE);
		} else if (C == 1) {
			(null,"Ball in glass : 3",null, JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
}


public class Skocimis {
	public static void main(String[] args) 
	{
		int num1, num2, num3;
		String s1,s2,s3;
		do {
			s1=("Enter integer :");
			num1 = Integer.parseInt(s1);
			s2=("Enter integer :");
			num2 = Integer.parseInt(s2);
			s3=("Enter integer :");
			num3 = Integer.parseInt(s3);
			if (num1 <= 0 || num1 >= 100) {
				(null,"Invalid Input. Please enter again!!!",null, JOptionPane.INFORMATION_MESSAGE);
			} else if (num2 <= 0 || num2 >= 100) {
				(null,"Invalid Input. Please enter again!!!",null, JOptionPane.INFORMATION_MESSAGE);
			} else if (num3 <= 0 || num3 >= 100) {
				(null,"Invalid Input. Please enter again!!!",null, JOptionPane.INFORMATION_MESSAGE);
			} else if (num2 <= num1) {
				(null,"Number2 must more than Number1. Please enter again!!!",null, JOptionPane.INFORMATION_MESSAGE);
			} else if (num3 <= num2) {
				(null,"Number3 must more than Number2. Please enter again!!!",null, JOptionPane.INFORMATION_MESSAGE);
			}
		} while (num1 <= 0 || num1 >= 100 || num2 <= 0 || num2 >= 100 || num3 <= 0 || num3 >= 100 || num3 < num1 || num3 < num2 || num2 < num1
				|| num1 > num2 || num1 > num3);
		(null," Most played : " + total(num1,num2,num3) + " time.",null, JOptionPane.INFORMATION_MESSAGE);
	
	}
		public static int total(int num1,int num2,int num3)
		{
		return(((num3 - num2) - 1));
		}
	}



public class Seven_Dwarves {
	public static void main(String[] args) {
		int num1, num2, num3, num4, num5, num6, num7, num8, num9;
		int count=0;
		String s1,s2,s3,s4,s5,s6,s7,s8,s9;
		do{
		do {
			s1=("Enter Number of Dwarves1 (1-99) : ");
			num1 = Integer.parseInt(s1);
		} while (num1 <= 0 || num1 >= 99);
		do {
			s2=("Enter Number of Dwarves2 (1-99) : ");
			num2 = Integer.parseInt(s2);
			if (num2 <= 0 || num2 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (num2 == num1) {
				System.out.println("Number2 Duplicate Number1. Please enter again!!!");
			}
		} while (num2 <= 0 || num2 >= 99 || num2 == n1);
		do {
			s3=JOptionPane.showInputDialog("Enter Number of Dwarves3 (1-99) : ");
			num3 = Integer.parseInt(s3);
			if (num3 <= 0 || num3 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (num3 == num1) {
				System.out.println("Number3 Duplicate Number1. Please enter again!!!");
			} else if (num3 == num2) {
				System.out.println("Number3 Duplicate Number2. Please enter again!!!");
			}
		} while (num3 <= 0 || num3 >= 99 || num3 == num1 || num3 == num2);
		do {
			s4=JOptionPane.showInputDialog("Enter Number of Dwarves4 (1-99) : ");
			num4 = Integer.parseInt(s4);
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
			s5=JOptionPane.showInputDialog("Enter Number of Dwarves5 (1-99) : ");
			num5 = Integer.parseInt(s5);
			if (num5 <= 0 || num5 >= 99) {
				System.out.println("Invalid Input. Please enter again!!!");
			} else if (num5 == num1) {
				System.out.println("Number5 Duplicate Number1. Please enter again!!!");
			} else if (num5 == num2) {
				System.out.println("Number5 Duplicate Number2. Please enter again!!!");
			} else if (umn5 == num3) {
				System.out.println("Number5 Duplicate Number3. Please enter again!!!");
			} else if (num5 == num4) {
				System.out.println("Number5 Duplicate Number4. Please enter again!!!");
			}
		} while (num5 <= 0 || num5 >= 99 || num5 == num1 || num5 == num2 || num5 == num3 || num5 == num4);
		do {
			s6=JOptionPane.showInputDialog("Enter Number of Dwarves6 (1-99) : ");
			num6 = Integer.parseInt(s6);
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
		} while (num6 <= 0 || num6 >= 99 || num6 == n1 || num6 == num2 || num6 == num3 || num6 == num4 || num6 == num5);
		do {
			s7=JOptionPane.showInputDialog("Enter Number of Dwarves7 (1-99) : ");
			num7 = Integer.parseInt(s7);
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
			s8=JOptionPane.showInputDialog("Enter Number of Dwarves8 (1-99) : ");
			num8 = Integer.parseInt(s8);
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
			s9=JOptionPane.showInputDialog("Enter Number of Dwarves9 (1-99) : ");
			num9 = Integer.parseInt(s9);
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
		} else if ((num2 + num3 + num4 + num5 + num6 + num7 + unm8) == 100) {
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
