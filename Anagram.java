import java.util.*;
public class Anagram {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
char[] a1=s1.toCharArray();
char[] a2=s2.toCharArray();
int count=0;
if(a1.length==a2.length) {
for(int i=0;i<a1.length;i++) {
for(int j=0;j<a2.length;j++) {
if(a1[i]==a2[j]) {
count++;
}
}}
System.out.println(count);
if(count==(a1.length)) {
System.out.println("Anagram");
}
else
{
System.out.println("Not an anagram"); }
}}