//Program to find element from an sorted array using binary search.

import java.util.Scanner;

public class BinarySearch
{
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the Size of the Array :- ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Array :- ");
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter the "+(i+1)+" element :- ");
			arr[i] = sc.nextInt();
		}	
		System.out.println("Entered Array is :- ");
		for(int i=0;i<size;i++)
		{
			System.out.print("\t"+arr[i]);
		}

		//Binary search

		System.out.print("\nEnter the number  which you want to search: ");
		int key = sc.nextInt();
		int first = 0;
		int last = arr.length - 1;
		int mid = (first + last)/2;  

   		while( first <= last )
   		{  
      			if ( arr[mid] < key )
      			{  
    	    			first = mid + 1;     
    	  		}
    	  		else if ( arr[mid] == key )
    	  		{  
    	    			System.out.println("Element is found at : " + mid);  
    	    			break;  
    	  		}
    	  		else
      			{  
         				last = mid - 1;  
      			}  
      			mid = (first + last)/2;  
   		}  
   		if ( first > last )
   		{  
      			System.out.println("Element is not found!");  
   		}
	}
}		