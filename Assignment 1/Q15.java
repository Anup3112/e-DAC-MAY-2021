import java.util.Scanner; 
class Q15
{
public static void main(String []args)
{
Scanner Sc = new Scanner(System.in);
System.out.println("Enter two integer");
int i = Sc.nextInt();
int j = Sc.nextInt();
int temp;

System.out.println("i: "+i);
System.out.println("j: "+j);

temp=i;
i=j;
j=temp;
System.out.println("i: "+i);
System.out.println("j: "+j);
}
}