package arrays;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the year");
		int ly=s.nextInt();
		if(ly%4==0) 
		{
			if(ly%100==0)
			{
				if(ly%400==0)
				
					System.out.println("Leapyear");
				    else 
				     System.out.println("Not a Leapyear");
				}
				    else
					 System.out.println("Leapyear");
						}
					else
					 System.out.println("Not a Leapyear");
			
				s.close();
						
					}
				}
		




