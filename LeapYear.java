import java.util.*;
class LeapYear
 {
    public static void main(String[] args) 
    {
	int year;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Year - ");
	year=sc.nextInt();
	if(year%4==0)
	{
		if(year%100==0 && year%400!=0)
			System.out.print(year+" is not a Leap Year.");
		else
			System.out.print(year+" is a Leap Year.");
	}
	else
		System.out.print(year+" is not a Leap Year.");
    }
}