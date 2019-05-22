import java.util.*;
public class perfectSquare {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=(int) Math.sqrt(a);
int c=b*b;
if(a==c) {
System.out.println("Perfect Square");
}
else {
System.out.println("Not Perfect square");
}
}}