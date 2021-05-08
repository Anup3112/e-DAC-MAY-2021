import java.util.Scanner;
class Q7
{
public static void main(String args[])
{
  Scanner Sc=new Scanner(System.in);
  System.out.println("Enter number :");
int n = Sc.nextInt();
for(int i=1;i<=10;i++)
{
    int j =n*i;
   System.out.println(n+"x"+i+"="+j);
}
 
}
}