import java.io.*;
import java.util.*;
class Student
{
public static void main(String args[])
{

System.out.println("Enter n value");
int n,x,p,j=1;
scanner s=new scanner(System.in);
n=s.nextInt();
System.out.println("enter the pair");
p=s.nextInt();
for(int i=0;i<2*n;i++)
{
x=2*n-i;
if(p!=x)
{
System.out.println("The pair is for days is "+p "+" j++ "+" p);
}
}
}
}