import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int Firstdigit=(n/100);
     int Seconddigit=((n/10)%10);
     int Lastdigit=(n%10);
    int Reverse=(Lastdigit*100)+(Seconddigit*10)+(Firstdigit);
    System.out.println(Reverse);
  }
}