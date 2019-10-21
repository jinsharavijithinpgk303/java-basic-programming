package operators;
import java.util.Scanner;
public class Allopr {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the first number");
	int a = s.nextInt();
	System.out.println("enter the second number");
	int b = s.nextInt();
	int sum = a+b;
	System.out.println(sum);
	int sub = a-b;
	System.out.println(sub);
	int div = a/b;
	System.out.println(div);
	int mod = a%b;
	System.out.println(mod);
	int mul = a*b;
	System.out.println(mul);
	

	}

}
