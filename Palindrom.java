import java.util.Scanner;
public class Palindrom{
	Scanner scanner=new Scanner(System.in);
	public static void main(String [] args){
     Palindrom palindrom=new Palindrom();
     palindrom.method();
	}
	private void method(){
    String given=scanner.nextLine();
    String revers="";
    for(int i=given.length()-1; i>=0; i--){
        revers+=given.charAt(i);
    }
    System.out.println(given.equals(revers));
	}
}