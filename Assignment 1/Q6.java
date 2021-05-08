import java.util.Scanner;
class Q6
{
public static void main(String args[])
{
  Scanner Sc=new Scanner(System.in);
  System.out.println("Enter numbers for operation :");
int i = Sc.nextInt();
int j = Sc.nextInt();
int k = i+j;
int l = i-j;
int m = i*j;
int n = i/j;
int o = i%j;
System.out.println("Addition : "+k);
System.out.println("Subtraction : "+l);
System.out.println("multiplication : "+m);
System.out.println("Division : "+n);
 System.out.println("modulus : "+o);
}
}