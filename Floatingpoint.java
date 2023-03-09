import java.util.*;
class Floatingpoint
 {
    public static void main(String[] args) 
    {
	Float n1,n2;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the First number - ");
	n1=sc.nextFloat();
	System.out.print("Enter the Second number - ");
	n2=sc.nextFloat();
	if(n1.compareTo(n2)==0)
		System.out.print(n1+" and "+n2+" is Equal.");
	else
		System.out.print(n1+" and "+n2+" is not Equal.");
    }
}