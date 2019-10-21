package decisionmaking;
import java.util.Scanner;
public class Ifelsestat1 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char Name = s.next().charAt(0);
        int pass = s.nextInt();
        if(Name=='A' &&pass==1)
        {
        	System.out.println("successful");
        	
        }
        else
        {
        	System.out.println("Not successful");
        	
        }
	}

}
