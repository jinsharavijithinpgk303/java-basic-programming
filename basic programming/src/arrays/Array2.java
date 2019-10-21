package arrays;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("enter the number");
       int i;
       int e;
       int size = s.nextInt();
       int[] a = new int[size];
       int sum=0,sum1=0,b=0,c=0;
       int o;
       for(i=0;i<size;i++)
       {
    	   System.out.println("enter the integer +i+");
    	   a[i]=s.nextInt();
       }
       for(i=0;i<size;i++)
       {
    	   if(a[i]%2!=0)
    	   {
       
       System.out.println(a[i]);
       sum=sum+a[i];
       b++;
	}
       }
	for( i=0;i<size;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
			sum1=sum1+a[i];
			c++;
		}
	}
	e=sum/b;
	o=sum1/c;
	System.out.println(e);
	System.out.println(o);
       }
		
	}

