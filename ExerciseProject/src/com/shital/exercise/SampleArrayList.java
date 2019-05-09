package com.shital.exercise;
import java.util.*;

public class SampleArrayList {

 public static void main(String args[]){ 
	 
    ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
           list.add("D");//Adding object in arraylist  
           list.add("C");  
           list.add("A");  
           list.add("B");  
            
           System.out.println("Traversing list through List Iterator:");  
           //Here, element iterates in reverse order  
           ListIterator<String> list1=list.listIterator(list.size());  
           while(list1.hasPrevious())  
           {  
               String str=list1.previous();  
               System.out.println(str);  
           }  
     System.out.println("Traversing list through for loop:");  
        for(int i=0;i<list.size();i++)  
        {  
         System.out.println(list.get(i));     
        }  
 }
}
