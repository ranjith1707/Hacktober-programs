import java.util.Scanner;
class Hacktober1{
	Scanner scanner=new Scanner(System.in);
public static void main(String[] args){
Hacktober1 zoho=new Hacktober1();
System.out.println(zoho.myMethod());
}
int myMethod(){
int a=scanner.nextInt();
int b=scanner.nextInt();
int c=scanner.nextInt();
if(a>b&&a<c||a<b&&a>c)
return a;
	else if(b>a&&b<c||b<a&&b>c)
        return b;
		else
          return c;
}
}