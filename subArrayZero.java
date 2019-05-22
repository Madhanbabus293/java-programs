import java.util.*;
public class subArrayZero {
public static void main(String[] args) {
int sum=0,flag=0,count=0;
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int[] arr=new int[l];
for(int i=0;i<arr.length;i++) {
arr[i]=s.nextInt();
}
for(int i=0;i<arr.length;i++) {
for(int j=i;j<arr.length;j++) {
sum=sum+arr[j];
if(sum==0) {
count+=1;
System.out.print("True");
break;
}
else {
flag=1;
}
}
sum=0;
}
if(flag!=0&&count==0) {
System.out.print("false");
}
}}