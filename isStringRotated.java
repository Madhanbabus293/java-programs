import java.util.*;
public class IsStringRotated {
public static void main(String args[]) {
Scanner x=new Scanner(System.in);
String s=x.nextLine(); 
String s1=x.nextLine();
String s3="";
int flag=0;
int r=s.length();
char[] a=s.toCharArray();
char[] a1=new char[r];
int k=0,z=0;
for(int x1=0;x1<r;x1++) {
a1[a.length-1]=a[k];
for(int i=1;i<=r-1;i++) {
a1[z]=a[i];
z++;
}
z=0;
for(int i=0;i<r;i++) {
a[i]=a1[i];
s3=s3+a1[i];
}
if(s3.equals(s1)) {
  flag=1;
  break;
}
s3="";
k=0;
}
if(flag==1) {
  System.out.println("True");
}
else {
  System.out.println("false");
}
}}