import java.util.*;
public class reverseEachWord {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String[] s2=s1.split("\\s");
String s3="";
for(int i=0;i<s2.length;i++) {
for(int j=s2[i].length()-1;j>=0;j--) {
s3=s3+s2[i].charAt(j);
}
}
System.out.println(s3);
}}