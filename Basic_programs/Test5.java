// package Basi_programs;
// import java.util.*;   
class Test5 
{
	public static void main(String args[])
	{
		// Scanner Sc = new Scanner(System.in);
		// System.out.print("Enter the number: ");
		// int num = Sc.nextInt();
		int m1= 56;
		int m2= 30;
		int m3=60;
		int m4 = 85;
		int m5 = 76;
		int Avg = (m1+m2+m3+m4+m5)/5 ;
		int maks = Avg ;

		if(maks >= 90)
		{
			System.out.println("Graed A:");
		}
		else if(maks >= 70)
		{
			System.out.println("Greade B:  ");
		} 
		else if(maks >= 60)
		{
			System.out.println("Greade C:  ");
		} 
		else
		{
			System.out.println("Faild:  ");
		}

		System.out.printf("total maks is: %d",Avg);
		System.out.printf("total maks is: %d",maks);
	}
}
