package demo;
   import java.util.Scanner;
public class ConcecutiveString {
   public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter The String :");
	   String str=scanner.nextLine();
	   
	   ConcecutiveString consecutive=new ConcecutiveString();
	  System.out.println( consecutive.method(str,1));   
   }
   private boolean method(String str,int index) {  
	   if(index<str.length()) {
		   if(str.charAt(index)==str.charAt(index-1)) {
			   return true;
		   }
		   else {
			   index++;
			   return method(str,index);
		   }
	   }
	   return false; 
   }
}
