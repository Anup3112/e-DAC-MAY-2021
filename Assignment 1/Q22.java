import java.lang.*;
import java.util.*;

class Q22
{
	public static void main (String args[])
	{
		int a, i=0, temp=0;
		System.out.println("Enter binary number:");
		Scanner sc=new Scanner (System.in);
		a=sc.nextInt();
		while(a!=0){
			
			int k = a%10;
			double power = Math.pow(2,i);
			temp = temp + (k* (int)power);
			a= a/10;
			i++;
		}
		System.out.println("Decimal Number:"+temp);

		
	}
}
