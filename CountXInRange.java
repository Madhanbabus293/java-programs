import java.util.*;
public class CountXInRange {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int u=s.nextInt();
int d=s.nextInt();
int count=0;
for(int i=l;i<=u;i++) {
int r=0;
r=i;
for(;r!=0;) {
int a=r%10;
if(a==d) {
count++;
}
r=r/10;
}
}
System.out.println(count);
}}