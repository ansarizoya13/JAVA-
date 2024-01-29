class bytedata
{
	public static void main(String args[])
	{
		byte num1 =10;
		int num2;
		short num3;
		num2 = num1;
		num3 = num1;

		System.out.println("byte is "+num1);
		System.out.println("integer value is "+num2);
		System.out.println("Short number is "+num3);

		
		int num4 = 50;
		byte num5;
		short num6;
		num5 = (byte)num4;
		num6 = (short)num4;
		
		System.out.println("The int value is "+num4);
		System.out.println("The byte value is "+num5);
		System.out.println("The short value is "+num6);
	}
}