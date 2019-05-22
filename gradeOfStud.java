import java.util.*;
public class gradeOfstud {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if((a>=91)&&(a<=100)) {
System.out.println("s");
}
else if(a>=41 && a<=50 ) {
System.out.println("D");
}
else if(a>=51 && a<=60 ) {
System.out.println("C");
}
else if(a>=61 && a<=70 ) {
System.out.println("B+");
}
else if(a>=71 && a<=80 ) {
System.out.println("B");
}
else if(a>=81 && a<=90 ) {
System.out.println("A");
}
else if(a>=0 && a<=40) {
System.out.println("U");
}
else
{
System.out.println("Invalid");
}
}
}
