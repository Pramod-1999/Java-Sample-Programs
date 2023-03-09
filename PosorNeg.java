import java.util.Scanner;
class PosorNeg
 {
    public static void main(String[] args) 
    {
        	int n;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number :");
	    n=sc.nextInt();
	    if(n>0)
	    {
	 	    System.out.println(n+"Is Positive");
	    }
	    else if(n<0)
	    {
	    	System.out.println(n+"Is Negative");
	    }
	    else
	    {
	    	System.out.println(n+"Is Zero");
	    }
	
    }
}