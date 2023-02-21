package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Bank b=new BankImpl(5000);
		while(true) {
		
			System.out.println(" 1.Deposite \n 2.withdraw \n 3.Current Balance \n 4.Exit ");
			System.out.println("Enter your Choice");
			int key=scan.nextInt();
			switch(key) {
			case 1:
				System.out.println("Enter the deposite amount");
				int amounttodeposite=scan.nextInt();//we also do b.deposited(scan.nextInt());
				b.deposite(amounttodeposite);
			break;
			
			case 2:
				System.out.println("Enter the withdraw amount");
				int amounttowithdraw=scan.nextInt();//we also do b.withdraw(scan.nextInt());
				b.withdraw(amounttowithdraw);
			break;
			
			case 3:
				System.out.println("Available Amount is "+b.getBalance());
			break;
			
			case 4:
				System.out.println("Thankyou!! visit again!!");
				System.exit(0);
			default:
				try {
					throw new InvalidchoiceExecption("Invalid choice");
				}
				catch(InputMismatchException i) {
					System.out.println(i.getMessage());
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println("--------------------------------------------");
		}
	}

}
