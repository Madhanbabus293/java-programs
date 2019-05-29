import java.util.*;
public class rotateArrayNTimes {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int[] a=new int[l];
for(int i=0;i<l;i++) {
a[i]=s.nextInt();
}
int r=s.nextInt();
int z=0,k=0;
int[] a1=new int[l];
for(int x=0;x<r;x++) {
a1[a.length-1]=a[k];
for(int i=1;i<=l-1;i++) {
a1[z]=a[i];
z++;
}
z=0;
for(int i=0;i<l;i++) {
a[i]=a1[i];
}
k=0;
}
for(int i=0;i<l;i++) {
System.out.print(a[i]);
}
}}