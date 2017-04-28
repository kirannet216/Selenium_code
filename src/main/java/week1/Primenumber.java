package week1;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initializing Variables  
		int i,m=0,flag=0,n;
	    //ClassName obj = new ClassName
		Scanner reader = new Scanner(System.in);
		//Getting Input no 
		System.out.println("Enter a number: ");
		//reading Input no 
		 n = reader.nextInt(); 
				    
		  m=n/2;    
		  for(i=2;i<=m;i++)
			  {    
				   if(n%i==0)
				   {    
				   System.out.println("Number is not prime");    
				   flag=1;    
				   break;    
				   }    
			  }    
			  if(flag==0)    
			  System.out.println("Number is prime"+ n);  
		
	}
		
}		

	


