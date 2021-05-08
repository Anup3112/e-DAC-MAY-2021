class Q21
{
public static void main(String []args)
{
int num=15;
int rem;
String str="";
char Dig[]={'0','1','2','3','4','5','6','7'};
while(num>0)
{
rem=num%8;
str=Dig[rem]+str;
num=num/8;
}
System.out.println("Decimal to Octal :"+str);
}
}