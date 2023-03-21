//Program to Add two numbers using Class

import java.util.*;
public class Add2Num
{
	 public static void main(String[] args)
	{
		System.out.print("Program to add two numbers using Class ---");	
		Num2 n1 = new Num2();
		n1.get_numbers();
		n1.add_print();
	}
}

class Num2
{
	int num1,num2,sum;
	public void get_numbers()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the first number :- ");
		num1=sc.nextInt();
		System.out.print("\nEnter the secind number :- ");
		num2=sc.nextInt();
	}
	public void add_print()
	{
		sum=num1+num2;
		System.out.print("\nThe sum is :- "+sum);
	}
}