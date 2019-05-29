import java.util.*;
public class maxProductInArray {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int[] arr=new int[a];
int max=0,p=1;
for(int i=0;i<a;i++) {
arr[i]=s.nextInt();
}
for(int i=0;i<a;i++) {
for(int j=i+1;j<a;j++) {
p=arr[i]*arr[j];
if(p>max) {
max=p;
p=0;
}
}
}
System.out.println(max);
}}

