import java.util.*;
public class PercentageinString {
public static void main(String args[]) {
Scanner s=new Scanner(System.in);
String str=s.nextLine();
//String str="M@dhAn";
int length=str.length();
int upper=0,lower=0,special=0,digit=0;
for(int i=0;i<str.length();i++) {
char l=str.charAt(i);
//System.out.println(arr[i]);
if(Character.isUpperCase(l)) {
upper++;
}
else if(Character.isLowerCase(l))  {
lower++;
}
else if(Character.isDigit(l)){
digit++;
}
else {
special++;
}
}
int a1=(upper*100)/length;
int a2=(lower*100)/length;
int a3=(special*100)/length;
int a4=(digit*100)/length;
System.out.println(a1+"% "+a2+"% "+a3+"% "+a4+"%");
}}
