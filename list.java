import java.util.*;
public class list {
public static void main(String args[]) {
ArrayList<Integer> a=new ArrayList<Integer>();
a.add(1);
a.add(2);
a.add(3);
a.add(4);
a.add(5);
Scanner s=new Scanner(System.in);
int b=s.nextInt();
for(int c:a) {
if(c==b) {
System.out.println("Present");
}
}}}