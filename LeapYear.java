import java.util.Scanner;
class LeapYear{
	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args){
      LeapYear leapyear=new LeapYear();
      leapyear.method();
	}
	void method(){
      int a=scanner.nextInt();
               	if(a%4==0 && a%100!=0){
                System.out.println("True");
        	}
        	else if(a%4==0 && a%100==0){
        		if(a%400==0){
        			System.out.println("True");
        		}
        		else{
        			System.out.println("False");
        		}
        	}
        	else{
        		System.out.println("False");
        	}
        }
	}
