
class StaticEx {
   static int a = 20;
   static int b;
   static void func(int c) {
	   System.out.println("a = " +a);
	   System.out.println("b = " +b);
	   System.out.println("c = " +c);
   }
   static {
	   System.out.println("In static block initialization");
	   b = a * 5;
   }
}
public class Display {

	public static void main(String[] args) {
		System.out.println("In the Main Method");
		StaticEx.func(9);
	}
}
