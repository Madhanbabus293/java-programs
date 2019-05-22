import java.util.*;
public class specialNo {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int sum=0,mul=1,b,f;
f=a;
for(int i=0;a!=0;i++) {
b=a%10;
sum=sum+b;
mul=mul*b;
a=a/10;
}
int temp=sum+mul;
if(temp==f) {
System.out.println("Special No");
}
else {
System.out.println("Not Special No");
}
}
}