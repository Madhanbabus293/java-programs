import java.util.*;
public class minDifferencePair {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int diff=0,min=100;
int[] arr=new int[l];
for(int i=0;i<l;i++){
arr[i]=s.nextInt();
}
for(int j=0;j<l;j++) {
for(int k=j+1;k<l;k++) {
if(arr[j]>arr[k]) {
diff=(arr[j])-(arr[k]); 
}
else {
diff=arr[k]-arr[j];
}
//System.out.println(diff);
if(diff<min) {
min=diff;
}
diff=0;
}
}
System.out.println(min);
}}