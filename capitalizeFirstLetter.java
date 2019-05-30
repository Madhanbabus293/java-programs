import java.util.*;
public class capitalizeFirstLetter {
public static void main(String args[]) {
Scanner s=new Scanner (System.in);
String str=s.nextLine();
String[] s1=str.split("\\s");
String s2="";
for(int i=0;i<s1.length;i++) {
s1[i]=(s1[i].substring(0,1).toUpperCase()+s1[i].substring(1,s1[i].length()));
System.out.print(s1[i]+" ");
}
}}