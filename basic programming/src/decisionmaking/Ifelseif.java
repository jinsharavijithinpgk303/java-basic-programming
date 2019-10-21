package decisionmaking;
import java.util.Scanner;
public class Ifelseif {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a>=90)
		{
			System.out.println("grade A+");
		}
		
		else if(a>=80)
		{
			System.out.println("grade B+");
		}
		else if(a>=50)
		{
			System.out.println("grade P");
		}
		else
		{
			System.out.println("Failed");
		}
			
		
			
		
		

	}

}
