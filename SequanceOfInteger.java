import java.util.Scanner;
public class SequanceOfInteger{
	private Scanner scanner=new Scanner(System.in);
	public static void main(String[] args){
    SequanceOfInteger sequance=new SequanceOfInteger();
    sequance.method();
	}
	private void method(){
    String input=scanner.nextLine();
    String[] sequance=input.split(";");
    int sum=0;
    for(int i=0; i<sequance.length; i++){
     sum+=Integer.parseInt(sequance[i]);
    }
    System.out.println(sum);
	}
}