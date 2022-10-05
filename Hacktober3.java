	import java.util.Scanner;
public class Hacktober3{
	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args){
		Hacktober3 h=new Hacktober3();
		h.method();
	}
	void method(){
  int number =scanner.nextInt();
  int temp;
  int sum=0;
  for(int i=0; number>0; i++){
temp=number%10;
number=number/10;
if(i==0|| a==0){
	sum+=temp;
}
  }
  System.out.println(sum);
	}
}