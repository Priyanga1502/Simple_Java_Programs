package static_final;
//Program to demonstrate static method
public class SM_MyclassDemo {
	public static void main(String[] args) {
	SM_Myclass o1 = new SM_Myclass();
	System.out.println(o1);
	// static method with class name
	SM_Myclass.display();
	SM_Myclass o2 = new SM_Myclass();
	System.out.println(o2);
	SM_Myclass.display();
	SM_Myclass o3 = new SM_Myclass();
	System.out.println(o3);
	SM_Myclass.display();
	}
}
