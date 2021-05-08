class P10
{
public static void main(String []args)
{
int i,j,k;
int a=65;
for(i=4;i>=0;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(" ");
}
for(k=i;k<=4;k++)
{
System.out.print(" "+(char)(a+k));
}

System.out.println();
}
}
}