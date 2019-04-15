import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(Sum_of_number(n));
    }
  public static int Sum_of_number(int y)
  {
    int Sum=0;
    for(int i=1;i<=y;i++)
    {
      Sum=Sum+i;
    }
    return Sum;
  
	}
}