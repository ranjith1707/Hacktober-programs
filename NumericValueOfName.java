import java.util.Scanner;
public class NumericValueOfName{
	private Scanner scanner=new Scanner(System.in);
	public static void main(String[] args){
   NumericValueOfName getNumeric=new NumericValueOfName();
   getNumeric.method();

	}
	private void method(){
		System.out.println("Enter The Name : ");
     String name=scanner.nextLine();
         int sum=0; 
         String numerics="";
     for(int i=0; i<name.length(); i++){
           sum+=(int)name.charAt(i)-96;
           int temp=(int)name.charAt(i)-96;
            numerics+=temp;
            if(i<name.length()-1)
               numerics+="+";
     }
     System.out.println("\n Sum of Numeric Value : "+ sum+"("+numerics+")");
	}
}