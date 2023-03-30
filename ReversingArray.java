//Program that copies contents of one array to another using length member.

import java.util.Scanner;

public class ReversingArray
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
		
		int start = 0;
		int end = size-1;
		int temp = 0;
		
		while(start < end)
		{
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start = start+1;
			end = end-1;
		}
		System.out.print("\nThe Reversed array is :- ");
		for(int i=0; i<size; i++)
		{
			System.out.print("\t"+array[i]);
		}
	}
}