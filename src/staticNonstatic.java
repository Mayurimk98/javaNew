
public class staticNonstatic {
//////////////////////STATIC/////////////////////////////////////
	/*
	 * // static data member static int a = 10;
	 * 
	 * // static member function static void test() {
	 * System.out.println("Running static method........"); }
	 * 
	 * // Static block static { System.out.println("Running static block"); //no
	 * need to call it can be directly executed }
	 * 
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * // Static can be access inside non static // We cant acess non static inside
	 * static block
	 * 
	 * System.out.println(staticNonstatic.a); staticNonstatic.test();
	 * 
	 * }
	 */
	
	//////////////////////NON STATIC//////////////////////////////
	int a=10;
	void test() {
		System.out.println("Running non static method.......");
	}
	{
		System.out.println("Running non static block.........");
	}
	staticNonstatic(){
		System.out.println("Running non static constructor........");
	}
	public static void main(String [] args) {
		staticNonstatic s1=new staticNonstatic();
		System.out.println(s1.a);
		s1.test();
	}

}
