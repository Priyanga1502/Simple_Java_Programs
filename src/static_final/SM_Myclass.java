package static_final;
//Program to demonstrate static block
public class SM_Myclass {
	private int section ; //non-static or instance variable
	private static int srNo; //static or class variable
	//static Block
	static
	{
	System.out.println("-----------Within Static Block---------");
	srNo=1000;
	}
	//default constructor
	SM_Myclass()
	{
	System.out.println("--------------Within Default Constructor-----------");
	srNo++;
	section++; 
	}
	@Override
	public String toString() {
	return "SM_Myclass [Serial No "+srNo+", Section=" + section + "]";
	}
	//static method
	static void display() 
	{
	// System.out.println("Section : "+section); //can't access non static members
	System.out.println("Serial No. "+srNo); 
	}
	}

