import java.util.*;

public class countbitset{
  
public static void main(String args[]) 
{
   
Scanner s=new Scanner(system.in); 
int a=s.nextInt();
int count=0;
    
String[] str=new String[a];
   
 String s1="";
    
int x=0;
    
for(int i=1;i<=a;i++){
     
 int b=i;
      
    
for(int j=0;b!=0;j++) {
      
int c=b%2;
      
s1=s1+c;
      
b=b/2;
    
}
    
str[x]=s1;
    
s1="";
    
int l=str[x].length();
    
for(int k=0;k<l;k++)
    
{
      
char ch=str[x].charAt(k);
      
if(ch=='1'){
        
count++;
      
}
    
}
    
x++;
    
}
    
for(int i=0;i<a;i++) 
{
      
System.out.println(str[i]+" ");
   
 }
    
System.out.println(count);
  
}

}