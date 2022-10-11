import java.util.Scanner;
public class Hacktober11{
Scanner scanner=new Scanner(System.in);
	public static void main(String[] args){
    Hacktober11 hacktober=new Hacktober11();
    hacktober.method();
	}
	private void method(){
       String given=scanner.nextLine();
         for(int i=1; i<=given.length(); i++){
         	for(int j=0; j<i; j++){
         		System.out.print(given.charAt(j));
         	}
         	System.out.print(" ");
         }
	}
}