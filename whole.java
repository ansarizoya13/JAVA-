import java.util.Scanner;

class whole
{
	public static void main(String args[])
	{
		byte b1;
		Scanner scin = new Scanner(System.in);
		System.out.print("ENTER THE NUMBER TO CHECK NUMBER IS WHOLE OR NOT : ");
		b1=scin.nextByte();
		if(b1>=0)
		{
			System.out.println("WHOLE NUMBER ");
		}
		else
		{
			System.out.println("NOT AN WHOLE NUMBER ");
		}
	}
}