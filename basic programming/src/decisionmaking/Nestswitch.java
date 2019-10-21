package decisionmaking;

import java.util.Scanner;

public class Nestswitch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1)veg\n2)non-veg\n");
		int n = s.nextInt();
		//System.out.println("food types");
		char f = s.next().charAt(0);
		switch(n){
			case 1:
				System.out.println("veg");
				System.out.println("food types");
				
				switch(f) {
				case 'a':
					System.out.println("meals");
				case 'b':
					System.out.println("fried rice");
				case 'c':
					System.out.println("dosha");
					break;
					default:
						System.out.println("invalied input");
				}
				break;
			case 2:
				System.out.println("non-veg");
				
				switch(f) {
				case 'a':
					System.out.println("chicken biriyani");
					break;
				case'b':
					System.out.println("poratta and beaf");
				case'c':
					System.out.println("shavarma");
					break;
					default:
						System.out.println("invalid input");}
				
					break;
		}
						
			
				
				
				
			
				
				
				}
		
	

	}


