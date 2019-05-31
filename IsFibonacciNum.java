import java.util.*;
public class IsFibonacciNum {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=0,b=1,c=0,flag=0;
for(;c<n;) {
c=a+b;
a=b;
b=c;
if(n==c) {
flag=1;
}
}
if(flag==1)
{
System.out.println("True");
}
else
{
System.out.println("False");
}
}}

