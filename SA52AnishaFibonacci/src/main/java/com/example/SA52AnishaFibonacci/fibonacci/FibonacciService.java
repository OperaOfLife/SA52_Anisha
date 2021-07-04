package com.example.SA52AnishaFibonacci.fibonacci;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService 
{

	
	//To generate Fibonacci Series
	  public List<Integer> fibo(int elements)
	  { 
	  int n1=-1,n2=1,n3,i;
	  
	  List<Integer> fiboList = new ArrayList<>();
	 
	 
	  for(i=0;i<elements;++i)
	  { 
		  n3=n1+n2; 
		  fiboList.add(n3);
		  n1=n2; 
		  n2=n3; 
	  }
	  	  
	  return fiboList;
	  }
	  
	  
	  //To sort the list of fibonacci series
	  public List<Integer> sort(List<Integer> fiboList)
	  { 
	 	  
	  List<Integer> sortedList = new ArrayList<>();
	  List<Integer> evenList = new ArrayList<>();
	  List<Integer> oddList = new ArrayList<>();
	  
	  for(Integer a:fiboList)
	  {
		  if(a%2 == 0)
			  evenList.add(a);
		  else
			  oddList.add(a);
	  }
	  
	  Collections.sort(evenList,Collections.reverseOrder());
	  Collections.sort(oddList,Collections.reverseOrder());
	  
	  sortedList.addAll(evenList);
	  sortedList.addAll(oddList);
	  
	  return sortedList;
	  }
}
