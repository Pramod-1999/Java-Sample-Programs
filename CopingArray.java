//Program that copies contents of one array to another using length member.

import java.util.Scanner;

public class CopingArray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array :- ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.print("\nEnter the Array - ");
		for(int i=0; i<size; i++)
		{
			System.out.print("\nEnter the " +(i+1)+" element - ");
			array[i]=sc.nextInt();
		}
		System.out.print("\nEnterd Array is -- ");

		for(int i=0; i<size; i++)
		{
			System.out.print("\t"+array[i]);
		}
		
		int[] arr = new int[array.length];
		for(int i=0; i<array.length; i++)
		{
			arr[i] = array[i];
		}
		System.out.print("\nThe copied array is :- ");
		for(int i=0; i<size; i++)
		{
			System.out.print("\t"+arr[i]);
		}
	}
}