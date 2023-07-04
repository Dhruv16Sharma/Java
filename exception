import java.util.*;

public class ExceptionEx {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num1, num2;
		System.out.println("Enter number 1: ");
		num1 = kb.nextInt();
		System.out.println("Enter number 2: ");
		num2 = kb.nextInt();
		try {
			int div = num1/num2;
			System.out.println(div);
		}catch(ArithmeticException ae) {
			System.out.println(ae);
		}finally {
			System.out.println("Final block always executed");
		}
		System.out.println("Rest of the Code");

	}

}
