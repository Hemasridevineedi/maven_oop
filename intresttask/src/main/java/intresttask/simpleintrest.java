package intresttask;
import java.lang.Math; 
import java.util.Scanner;
public class simpleintrest {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Do you want to calculate SIMPLEINTREST(S) or CompoundIntrest(C)");
		char enter=sc.next().charAt(0);
		if(enter=='S') 
		{
		System.out.println("Enter the amount");
		Double amount=sc.nextDouble();
		System.out.print("Enter the Rate of Intrest in deccimal");
		Double rate=sc.nextDouble();
		System.out.print("Enter the duration in Years");
		Double duration=sc.nextDouble();
		Double intrest;
		cluclating obj=new cluclating();
		intrest=obj.calculation(amount,rate,duration);
		System.out.println(intrest);
		}
		else if(enter=='C')
		{	
			System.out.println("Enter the amount");
			Double amount=sc.nextDouble();
			System.out.print("Enter the Rate of Intrest on decimal");
			Double rate=sc.nextDouble();
			System.out.print("Enter the duration in Years");
			Double duration=sc.nextDouble();
			Double compound,increment;
			System.out.print("Enter the rate of intrest increment ");
			increment=sc.nextDouble();
			compoundintrest ci=new compoundintrest();
			compound=ci.intrestcalculation(amount,rate,duration,increment);
			System.out.println(compound);
		}
		else
		{
			System.out.print("Invalid Data");
			
		}
		sc.close();
	}

}
