package basics;
import java.util.Scanner;
public class Char {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.println("enter the first character");
	char a = s.next().charAt(0);
	System.out.println(a);
	System.out.println("enter the second character");
	char b = s.next().charAt(0);
	System.out.println(b);

	}

}
