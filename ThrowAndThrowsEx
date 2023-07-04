class Age {
	boolean checkAge(int age) throws Exception {
		if (age > 18) {
			return true;
		}
		else
			throw new Exception("Age is less than 18");
	}
}

public class ThrowAndThrowsEx {

	public static void main(String[] args) {
		Age a1 = new Age();
		try {
			a1.checkAge(17);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
