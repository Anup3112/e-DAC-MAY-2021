class P13
{
public static void main(String []args)
{
int i,j,k;
int a=65;
for(i=0;i<=4;i++)
{
for(j=4;j>=i;j--)
{
System.out.print(" ");
}
for(k=0;k<=i;k++)
{
System.out.print(" "+(char)(a+i));
}


System.out.println();
}
}
}