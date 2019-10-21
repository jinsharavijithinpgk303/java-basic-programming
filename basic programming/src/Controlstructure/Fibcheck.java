int m = 1;
	for(int i=1;i<=100;i++)
	{
		c = a+b;
		if(a==n)
		{
			m++;
		}
		a=b;
		b=c;
	}
		if(m!=0)
		{
			System.out.println("YES");
		}
		else
		{
		System.out.println("NO");
		}
}
}
			
	}

}
