
public class Polymorphism {
	
	public static void addition(int x,int y) {
		System.out.println(x+y);
	}
	public static void addition(int x,int y, int z) {
		System.out.println(x+y+z);
	}
	public static void addition(int x,int y,int z,int q) {
		System.out.println(x+y+z+q);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        addition(13,14);
        addition(23,45,56);
        addition(2,3,4,5);
	}

}
