import java.util.*;
public class Reverse {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s3="";
String[] s2=s1.split("\\s");
int a=s.nextInt();
int j=0;
if(s2.length-1>a) {
for(int i=s2[a].length()-1;i>=0;i--) {
s3=s3+s2[a].charAt(i);
}
s2[a]=s3;
for(int k=0;k<s2.length;k++) {
System.out.print(s2[k]+" ");
}
}
else {
System.out.print(-1);
}
}}