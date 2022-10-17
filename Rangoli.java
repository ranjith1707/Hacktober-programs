package demo;
import java.util.Scanner;
public class Rangoli {
	 public static void main (String[] args) 
		{
		 Rangoli rangoli=new Rangoli();
		 rangoli.method();
			}	 
	 private void method() {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enetr the Number : ");
    int given= scanner.nextInt();
    char character=(char)(96+given);
    int count=given*2-1;
    int position=(given*2-1);
    int length=(given*2-1)+(given*2-2);
    for(int i=1; i<given*2; i++) {
 	   character=(char)(96+given);
 	   int printCount;
 	   if(i<=given) {
 	   position=i*2-1;
 	    printCount=1;
 	   }
 	   else {
 		  
 		   position-=2;
    	       printCount=1; 
 	   }
 	   for(int j=1; j<=length; j++) {
 		  
 		   if(j==count&&printCount<=position) {
 		      System.out.print(character);
 		      if(j<given*2-1)
 		           character--;
 		      else
 		    	  character++;
 		      printCount++;
 		       count+=2;
 		   }
 		   else {
 		   System.out.print("-");
 	   }
 	   }
 	   count=given*2-1;
 	   if(i<given) {
 		   count-=2*i;
 	   }else {
 		 count=(i+1)*2-count;  
 	   }
 	   System.out.println();
    }
	 }
	
}
