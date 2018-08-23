public class Mixed2 {

	public static void main (String [] args) {

		A a = new A();
		B b = new B();
		C c = new C();
		A a2 = new C();

		System.out.println("Вывод");
		b.m1(); c.m2(); a.m3();
		System.out.println("====================");
		System.out.println();

		System.out.println("Вывод");
		c.m1(); c.m2(); c.m3();
		System.out.println("====================");
		System.out.println();

		System.out.println("Вывод");
		a.m1(); b.m2(); c.m3();
		System.out.println("====================");
		System.out.println();

		System.out.println("Вывод");
		a2.m1(); a2.m2(); a2.m3();
		System.out.println("====================");
		System.out.println();

	}

}