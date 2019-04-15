import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int Sum=0;
      while(n > 0)
      {
        int rem=n % 10;
        Sum=Sum+rem;
        n=n/10;
      }
      System.out.print(Sum);
	}
}