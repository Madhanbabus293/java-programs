import java.util.*;
import java.lang.*;
public class arraylinkedlist{    
 public static void main(String args[]){    
     
  List<String> al=new ArrayList<String>();//creating arraylist    
  al.add("Ravi");   
  al.add("Vijay");    
  al.add("Ravi");    
  al.add("Ajay");    
    
  LinkedList<String> al2=new LinkedList<String>();    
  al2.add("arun");
  al2.add("kumar");    
  al2.add("mani");    
  al2.add("naveen");    
    
  System.out.println("arraylist: "+al);
  System.out.println("Linkedlist: "+al2);  
   Iterator itr=al2.descendingIterator();
   while(itr.hasNext()){
     System.out.println(itr.next()); }
 }    
}    