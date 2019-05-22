import java.util.*;
public class lcmgcd {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int a1=s.nextInt();
int b1=s.nextInt();
int gcd=1;
for(int i=1;i<=a1&& i<=b1;i++) {
if(a1%i==0 && b1%i==0) {
gcd=i;
}
}
int lcm=(a1*b1)/gcd;
System.out.println(gcd+" "+lcm);
}}