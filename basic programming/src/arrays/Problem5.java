package arrays;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number1");
	int a = s.nextInt();
	System.out.println("enter the number2");
	int b = s.nextInt();
	int i;
	int hcf, max,lcm=0;
	max=(a>b)?a:b;
	for(i=max;i>0;i++){
	if(i%a==0 && i%b==0);
	lcm=i;
	break;
	}
	System.out.println(lcm);
	s.close();
	}
}


		
	
	
	

	


