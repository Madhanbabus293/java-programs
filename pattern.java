import java.util.*;
public class pattern {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int f=1;
for(int i=0;i<a;i++) {
for(int j=0;j<=i;j++) {
System.out.print(f+" ");
f++;
}
System.out.println(" ");
}
}}