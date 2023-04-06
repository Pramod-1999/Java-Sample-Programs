//Program to Create an Array. 

import java.util.Scanner;

public class ArrayCreation
{
	public static void main(String args[])	
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the size of the Array :- ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Array :- ");
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter the "+(i+1)+" element :- ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Entered Array is :- ");
		for(int i=0; i<size; i++)
		{
			System.out.print("\t"+arr[i]);
		}
	}
}