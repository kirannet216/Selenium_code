package week1day2;

public class Finonacci {

	public static void main(String[] args) {
	//Initializing Variables 
      int a,b,c,i;
      a=1;
      b=0;
      c=0;
      //Print B value
      System.out.println(b);
      //initializing for Loop
      for (i=0;i<10;i++)
      {
    	  c= a+b; //Sum the a and b 
    	  System.out.println(c); //Printing the value c 
    	  a=b; //assigning value b to a
    	  b=c; //assigning value c to b
      }
      
		
		
	}

}
