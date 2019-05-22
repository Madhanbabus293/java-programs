import java.util.*;
public class factorialNo {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int mul=1;
for(int i=1;i<=a;i++) {
mul=mul*i;
}
System.out.println(mul);
}
}