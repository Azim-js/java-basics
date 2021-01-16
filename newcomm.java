class commline
{
	public static void main(String args[])
	{
		int i=0,count;
		count=args.length;
		String string;
		System.out.println("the number of arguments is " +count);
		while(i<count)
		{
			string=args[i];
			i=i+1;
			System.out.println(i+" my friend is "+string);
		}
	}
}

