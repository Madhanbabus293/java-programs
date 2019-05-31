import java.util.*;
public class EnclosedByOne {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int count=0;
String str="";
for(int i=0;a!=0;i++) {
  int b=a%2;
  str=str+b;
  a=a/2;
}
char[] arr=str.toCharArray();
for(int i=1;i<=arr.length-2;i++) {
  if(arr[0]=='1' && arr[arr.length-1]=='1') {
    if(arr[i]!='1') {
      count++;
    }
  }
}
if(count==(arr.length-2)) {
  System.out.println("Bit set");
}
else
{
  System.out.println("Bit not set");
}
    }
}