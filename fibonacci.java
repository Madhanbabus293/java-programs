import java.util.*;
public class fibonacci {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int x=0,y=1,s1=0;
System.out.println(0);
System.out.println(1);
for(int i=0;i<a-2;i++) {
s1=x+y;
x=y;
y=s1;
System.out.println(s1);
}
}
}