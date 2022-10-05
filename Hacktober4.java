import java.util.Scanner;
public class Hacktober4{
	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args){
      Hacktober4 h=new Hacktober4();
      h.method();
	}
	void method(){
		int given=scanner.nextInt();
		int revers=0;
		int temp;
while(given>0){
temp=given%10;
revers=revers*10+temp;
given=given/10;
}
		System.out.println(revers);
	}
}