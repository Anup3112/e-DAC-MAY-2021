class P9
{
public static void main(String []args)
{
int i,j,k;
int a=65;
for(i=0;i<=4;i++)
{
for(j=5;j>=i;j--)
{
System.out.print(" ");
}
for(k=0;k<=i;k++)
{
System.out.print(" "+(char)(a+k));
}

System.out.println();
}
}
}