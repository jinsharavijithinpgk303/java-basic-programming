package string;
import java.util.Scanner;
public class Stringproblem1 {

	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.println("enter the size:");
	  int n = s.nextInt();
	  String arr[] = new String[n];
	  int i;
	  for(i=0;i<n;i++)
	  {
		  arr[i] = s.next();
	  }
	  char c;
	  for(i=0;i<n;i++)
	  {
		  c= arr[i].charAt(0);
		  if(c=='a'||c=='e'|| c=='i'||c=='o'||c=='u')
		  System.out.println(arr[i]);
	  }
	  
	  
	  
	  
	  
	  

	}

}
