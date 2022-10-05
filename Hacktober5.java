import java.util.Scanner;
public class Hacktober5{
	Scanner scanner=new Scanner(System.in);
	public  static void main(String[] args){
     Hacktober5 h=new Hacktober5();
     h.method();
	}
	void method(){
   int given=scanner.nextInt();
   int temp;
   int count=0;
   while(given>0){
temp=given%10;
if(temp==4){
  count++;
}
given/=10;
   }
   System.out.println(count);
	}
}