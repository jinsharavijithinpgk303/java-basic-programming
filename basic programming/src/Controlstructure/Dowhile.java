package Controlstructure;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Dowhile{

	public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int a;
    int sum=0;
    do {
    	a = Integer.parseInt(br.readLine());
    	System.out.println("Enter the number");
    
    if(a>0)
    {
    	sum=sum+a ;
    }
	}
    while(a>0);
    {
    System.out.println(sum);
	}
}
}
		

	


