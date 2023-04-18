//Program for sorting a given list of names in ascending order
import java.util.Scanner;

public class Ascendingorder
{
	public static void main(String args[])
	{
        	Scanner reader = new Scanner(System.in);
        	System.out.print("\nEnter the numbers of names : ");
        	int n = reader.nextInt();
   	String[] names = new String[n];
        	System.out.print("\nEnter the names - ");
       	 for (int i = 0; i < n; i++  )
       	 {
      	 	     System.out.print("\nEnter the name "+(i+1) + " :  ");
      	 	     names[i] = new String(reader.next());
      	  }
      
     	   for (int i = 0; i<n; i++)
	   {
    	        for (int j=i+1; j<n; j++)
            	        {
                		if (names[i].compareTo(names[j]) > 0)
                		{
                		    String temp = names[i];
                		    names[i] = names[j];
                		    names[j] = temp;
               		 }
                              }
        	}
      
     	   System.out.print("\nSorted names are ---");
     	   for (int i=0; i<n; i++)
    	    {
    	        System.out.print("\n" + names[i]);
    	    }
    }
}