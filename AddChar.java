//Program to Add two CHARATCTERS using Class

import java.util.*;
public class AddChar
{
	 public static void main(String[] args)
	{
		System.out.print("Program to add two CHARACTERS using Class ---");	
		Char ch=new Char();
		ch.get_char();
		ch.simple_add();
		ch.arithematic_add();
	}
}

class Char
{
	char ch1,ch2;
	public void get_char()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the first character :- ");
		ch1=sc.next().charAt(0);
		System.out.print("\nEnter the second chracter :- ");
		ch2=sc.next().charAt(0);
	}
	public void simple_add()
	{
		System.out.print("\nSimple addition of two numbers is :- "+ch1 +ch2);
	}
	public void arithematic_add()
	{
		Scanner read=new Scanner(System.in);
		System.out.print("\nEnter the first number to add  :- "); 
		int n1=read.nextInt();
		int temp1=ch1+n1;
		System.out.print("\nAdding 2 to ch1 is :- "+(char)temp1); 	
		
		System.out.print("\nEnter the second number to add  :- "); 
		int n2=read.nextInt();
		int temp2=ch1+n2;
		System.out.print("\nAdding 2 to ch2 is :- "+(char)temp2); 
	}
}