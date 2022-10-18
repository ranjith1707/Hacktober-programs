package demo;
import java.util.Scanner;
public class CharacterArrayX {
  public static void main(String[] args) {
	  CharacterArrayX charecarr=new CharacterArrayX();
	  charecarr.method();
  }
  
  private void method() {
	 System.out.println("Enter the Number: ");
	  Scanner scanner=new Scanner(System.in);
	  int given=scanner.nextInt();
	  char[] chArr=new char[given*given];
	  for(int i=1; i<=given; i++) {
		  for(int j=1; j<=given; j++) {
			  if(i==j||j==given-i+1||j==1||j==given|| i==1||i==given) {
				 chArr[(i-1)*given+j-1]='#';
				 
			  }
			  else
				 chArr[(i-1)*given+j-1]=' ';  
		  }
	  }
	  for(int i=0;i<given; i++)
	  {
		  for(int j=0; j<given; j++) {
			  System.out.print(chArr[(i)*given+j]);
			  System.out.print(" ");
		  }
		  System.out.println();
	  }
  }
}
  