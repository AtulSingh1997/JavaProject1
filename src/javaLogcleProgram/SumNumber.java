package javaLogcleProgram;

import java.util.Scanner;

public class SumNumber {
	public static void main(String[] args) {
		System.out.println("Enter the any number");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		for(int i= 1;i<=n;i++)
		
			sum=sum+i;
		System.out.println(sum);
	}

}
