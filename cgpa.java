import java.util.Scanner;

class cgpa
{
	public static void main(String args[])
	{
		float marks;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number :");
		marks=input.nextFloat();
		
		if(marks>=90)
		{
			System.out.println("The grade is O");
		}
		else if(marks>=80 && marks<90)
		{
			
		  	System.out.println("The grade is A+");
		}
		else if(marks>=70 && marks<80)
		{
			System.out.println("The grade is A");
		}
		else if(marks>=60 && marks<70)
		{
			System.out.println("The grade is B+");
		}
		else if(marks>=50 && marks<60)
		{
			System.out.println("The grade is B");
		}
		else if(marks>=40 && marks<50)
		{
			System.out.println("The grade is C");
		}
		else
		{
			System.out.println("The grade is F");
		}

}
}