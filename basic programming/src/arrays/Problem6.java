package arrays;
import java.util.Scanner;
public class Problem6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number1");
		int a = s.nextInt();
		System.out.println("enter the number2");
		int b = s.nextInt();
		int i;
		int hcf,min,gcd=0;
		min=(a>b)?a:b;
		for(i=min;i>0;i--){
		if(a%i==0 && b%i==0);
		gcd=i;
		break;
		}
		System.out.println(gcd);
		s.close();
		}
	

	}


