import java.util.*;
public class fooBar{
public static void main(String[] args) {
int a;
Scanner in=new Scanner(System.in);
a=in.nextInt();
if((a%3==0)&&(a%5==0)) {
System.out.println("foobar");
}
else if(a%3==0) {
System.out.println("foo");
}
else if(a%5==0) {
System.out.println("bar");
}
else if((a%3!=0)&&(a%5!=0)) {
System.out.println("none");
}
}
}