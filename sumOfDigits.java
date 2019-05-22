import java.util.*;
public class sumOfDigits {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b,sum=0;
for(int i=0;a!=0;i++) {
b=a%10;
sum=sum+b;
a=a/10;
}
System.out.println(sum);
}
}