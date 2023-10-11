package thirdPackage;
//Program to demonstrate Private Constructor and Singleton class

public class PrivateConstrutorDemo {
		public static void main(String s[]) {
		// Can't create object with private constructor
		// MyClass m1=new MyClass();
		Myclass m=Myclass.getObject();
		m.setId(10);
		Myclass m1=Myclass.getObject();
		System.out.println(m);
		System.out.println(m1);
		}
}
