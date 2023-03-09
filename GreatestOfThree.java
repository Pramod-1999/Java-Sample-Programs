import java.util.*;
class GreatestOfThree
 {
    public static void main(String[] args) 
    {
	 int n1,n2,n3;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the First Number - ");
	n1=sc.nextInt();
	System.out.print("Enter the Second Number - ");
	n2=sc.nextInt();
	System.out.print("Enter the Third Number - ");
	n3=sc.nextInt();

	if(n1>=n2 && n1>=n3)
		System.out.print(n1+" is Greatest.");
	else if(n2>=n1 && n2>=n3)
		System.out.print(n2+" is Greatest.");
	else
		System.out.print(n3+" is Greatest.");
    }
}