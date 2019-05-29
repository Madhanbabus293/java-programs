import java.util.*;
public class nonRepeatNum {
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    int l=s.nextInt();
    int[] arr=new int[l];
    for(int i=0;i<l;i++) {
    arr[i]=s.nextInt();
    }
   // int l=8;
    //int[] arr={1,1,2,2,3,4,4,5};
    int count=0,flag=0;
    for(int i=0;i<l;i++) {
      for(int j=0;j<l;j++) {
        if(arr[i]==arr[j]) {
          count++;
        }
      }
      if(count==1) {
        System.out.println(arr[i]);
      }
      count=0;
    }
  }}