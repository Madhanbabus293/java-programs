import java.util.*;

public class genBinarynos {
  
public static void main(String args[]) 
{
    
int a=10;
    
String[] str=new String[a];
    
String s1="";
    
int x=0;
    
for(int i=1;i<=a;i++)
{
      
int b=i;
      
    
for(int j=0;b!=0;j++) 
{
      
int c=b%2;
      
s1=s1+c;
      
b=b/2;
    
}
    
str[x]=s1;
    
s1="";
    
x++;
    
}
    
for(int i=0;i<a;i++) 
{
      
System.out.print(str[i]+" ");
    
}
  
}

}