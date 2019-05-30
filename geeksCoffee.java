import java.util.*;
public class geeksCoffee {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int t=s.nextInt();
for(int i=0;i<t-1;i++) {
n=n/2;
}
System.out.println(n);
}}