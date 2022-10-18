package demo;
public class GenarateLetters {
public static void main(String[] args) {
	 GenarateLetters g=new  GenarateLetters();
	 g.method();
}
private void method() {
	char ch;
	for(int i=0; i<26; i++) {
		ch='a';
		ch+=i;
		for(int j=0; j<26; j++) {
			System.out.print(ch);
			System.out.print(" ");
			ch++;
			if(ch>'z')
				ch='a';
		}
		System.out.println();
	}
}
}
