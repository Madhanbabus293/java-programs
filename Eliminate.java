import java.util.*;
public class Eliminate {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
String s3="";
for(int i=0;i<s2.length();i++) {
s3="";
for(int j=0;j<s1.length();j++) {
if(s2.charAt(i)!=s1.charAt(j)) {
s3=s3+s1.charAt(j);
}
}
s1=s3;
}
System.out.println(s3);
}}

