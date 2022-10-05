import java.util.Scanner;
class Hacktober2{
	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args){
   Hacktober2 h=new Hacktober2();
   h.method();
	}
	void method(){
          int a=scanner.nextInt();
          int b=scanner.nextInt();
          int c=scanner.nextInt();
          if(a==0||b==0||c==0||(a+b+c!=180)){
          	System.out.println("False ");
          }
          else
          	System.out.println("True");
	}
}