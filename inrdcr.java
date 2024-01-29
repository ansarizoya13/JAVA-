import java.util.Scanner;

class inrdcr
{
	public static void main(String args[])
	{
		byte num1;
		short num2,temp;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		num1=input.nextByte();
		num2=num1;
		num1++;
		num2--;
		
		System.out.println(" BEFORE SWAPPING : A = "+num1 +"  B = "+num2);
		temp = num1;
		num1 = (byte)num2;
		num2 = temp;
		System.out.println(" AFTER SWAPPING : A = " +num1+ "  B = "+num2);
				
	}
}