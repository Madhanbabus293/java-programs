import java.util.*;
public class Palindrome {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
String str1=s.nextLine();
String str2="";
for(int i=str1.length()-1;i>=0;i--) {
str2=str2+str1.charAt(i);
}
if(str1.equals(str2))
{
System.out.println("Palindrime");
}
else {
System.out.println("Not Palindrome");
}
}}