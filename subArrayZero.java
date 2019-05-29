import java.util.*;
public class subArrayZero {
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    int l=s.nextInt();
    int[] arr=new int[l];
    for(int i=0;i<l;i++) {
    arr[i]=s.nextInt();
    }
    //int l=5;
    //int[] arr={4,2,-3,1,6};
    int flag=0,sum=0;
    for(int i=0;i<l;i++) {
sum=sum+arr[i];
      for(int j=i+1;j<l;j++) {
              sum=sum+arr[j];
              if(sum==0) {
                flag=1;
                break;
              }
      }
      sum=0;
    }
      if(flag==1) {
        System.out.println("True");
      }
      else 
      {
        System.out.println("False");
      }
  }}