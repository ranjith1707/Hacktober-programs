
import java.util.Scanner;
import java.util.Arrays;
public class HacktoberRecurtion{
public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter The Length of the Array");
	 int arrayLength=scanner.nextInt();
	 int[] integerArray=new int[arrayLength];
	 int given;
	 for(int i=0; i<arrayLength; i++) {
		 System.out.println("Enetr the Number");
		 given=scanner.nextInt();
		 integerArray[i]=given;
	 }
	 int index=0;
	 System.out.println(Arrays.toString(integerArray));
	 HacktoberRecurtion h=new HacktoberRecurtion();
	 System.out.println(Arrays.toString(h.method(integerArray,index)));
}
private int[] method(int[] arr,int index) {
	
	if(index!=arr.length) {
	
		int i=arr[index];
	arr[index]=i+1;
	index++;
	}
	else{
		return arr;
	}
	return method(arr,index);
}


}