package decisionmaking;
import java.util.Scanner;
public class Ifelseifstat1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a>=70)
		{
			System.out.println("Old Age");
		}
		else if(a>=45)
		{
			System.out.println("Middle Age");
		}
		else if(a>=18)
		{
			System.out.println("Teenage");
		}
		else
		{
			System.out.println("Childrens");
		}

	}

}
