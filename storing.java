import java.util.*;
public class storing {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String[] s2=s1.split("\\s");
String max="";
String s3="";
for(int i=0;i<s2.length;i++) {
for(int j=0;j<s2[i].length();j++) {
char x=s2[i].charAt(j);
if((x>='1')&&(x<='9')) {
s3=s2[i];
if(s3.length() > max.length()) {
max=s3;
}
s3="";
}}}
System.out.println(max);
}}