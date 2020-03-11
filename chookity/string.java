class string
{
	public static void print(Object s) { System.out.println(s); }
	public static void main(String[] args)
	{
		String s = new String("abcd");
		String a = new String("abcd");
		print(s==a);
		print(s.equals(a));
		s=s.intern();
		a=a.intern();
		print(s==a);
		String s1 = new String("abcd");
		print("Compare To: "+ s.compareTo(a));
		print("Substring: " +s.substring(1,4));

		Boolean x = s1.intern()==a;
		print("intern: " + x);

		String b = "alpha,beta,theta";
		double i = 5.44;
		// String[] temp= ;
		print("split: " + b.split(",")[0]); //don't forget double quotes
		print("Sring.valueOf: " + String.valueOf(i) );
		//using string buffer
		StringBuffer lol = new StringBuffer(b);
		lol.append("java");//mutable
		print("append: "  + lol.append("java"));
		lol.reverse();
		print("reverse: " + lol);
		print("replace: " + lol.replace(2,5,"just gonna"));
		//deletes 2 to 5 and places just gonna
		String j = lol.toString();
		print("converted to String: " + j);
	}
}