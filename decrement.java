class decrement
{
	public static void main(String[] args)
	{
	  int a = 10, b = 15, c = 5;
	  
	  int d = a++ + b-- - c++ + a-- - b++ + c--;
	  int e = --b - c-- + --a - ++b + ++c - ++a;
	  int f = --a + --b + --c + ++a + ++b + ++c;
	  
	  System.out.println("a : "+a);
	  System.out.println("b : "+b);
	  System.out.println("c : "+c);
	  System.out.println("d : "+d);
	  System.out.println("e : "+e);
	  System.out.println("f : "+f);
	}
}