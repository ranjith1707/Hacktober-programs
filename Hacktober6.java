import java.util.Scanner;
public class Hacktober6{
	Scanner scanner=new Scanner(System.in);
	public static void main(String[] args){
      Hacktober6 h=new Hacktober6();
      h.method();
	}
	void method(){
       String str=scanner.nextLine();
       String[] strArray=str.split(" ");
       String output="";
       for(int i=0; i<strArray.length; i++){
       char[] charArr=strArray[i].toCharArray();
       charArr[0]=Character.toUpperCase(charArr[0]);
       for(int j=0; j<charArr.length; j++){
         output+=charArr[j];
       }
       output+=" ";
       }
       System.out.println(output);
	}
}