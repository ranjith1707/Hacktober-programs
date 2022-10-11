import java.util.Scanner;
public class Hacktober10{
	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args){
    Hacktober10 hacktober=new Hacktober10();
    hacktober.method();
	}
	private void method(){
        String name= scanner.nextLine();
        int length=(name.length())-(name.length()/2);
        main:
        for(int i=0; i<name.length(); i++){
        	for(int j=0; j<length; j++){
        	  	
             System.out.print(name.charAt(i));
             if(i==name.length()/2-1&&name.length()%2==0){
                    continue main;
             }
        	}	
              if(i<name.length()/2){
                   length-=1;
              }
              if(i>=name.length()/2){
              	length+=1;
              }
        }
	}
}