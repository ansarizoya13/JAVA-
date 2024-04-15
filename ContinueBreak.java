class ContinueBreak
{
  public static void main(String args[])
  {
    LOOP: for (int i=1;i< 100; i++)
    {
      System.out.println("");
      if (i >= 10) break;
        for (int j=1; j < 100; j++)
      {
        System.out.print("*");
        if (j == i)
          continue LOOP;
      }
    }
    System.out.println("Termination by BREAK");
  }
}