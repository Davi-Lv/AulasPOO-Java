public class ExercicioOperadores {

	public static void main(String[] args) {

		int a, b, c;

		a = 5;
		b = 2;
		c = b-- + ++a;
		System.out.println(c);

		a = 2;
		b = 3;
		c = 4;
		c -= a + 5;
		System.out.println(c);
		
		a = 6;
		b = 8;
		c = a >= b ? 15 : 10;
		System.out.println(c);
		
		String x = "5";
		String y = "5";
		String z = x + y;
		System.out.println(z);
	}
}
