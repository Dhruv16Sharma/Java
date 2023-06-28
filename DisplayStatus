class Number {
	private double a;
	Number(double a){
		this.a = a;
	}
	
	boolean isZero() {
		return (a == 0);
	}
	
	boolean isPositive() {
		return (a >= 0);
		
	}
	
	boolean isNegative() {
		return (a < 0);
	}

	boolean isOdd() {
		return (a % 2 != 0);
	}

	boolean isEven() {
		return (a % 2 == 0);
	}
	
	boolean isPrime() {
		if(a <= 1) {
            return false;
        }
		for(int i = 2; i <= a/2; i++) {
           if((a % i) == 0)
               return  false;
           }
		return true;
    }
		
	
	boolean isArmstrong() {
		int number = (int) a;
		int total = 0, temp;
		while (number != 0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number /= 10;
	        }

	        if(total == a)
	        	return true;
	        else
	        	return false;
	    }


	@Override
	public String toString() {
		return "Zero = " + isZero() + ", Positive = " + isPositive() + ", Negative = " + isNegative()
				+ ", Odd = " + isOdd() + ", isEven = " + isEven() + ", Prime = " + isPrime()
				+ ", Armstrong = " + isArmstrong();
	}
	
	

}
public class DisplayStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n1 = new Number(407);
		System.out.println(n1.toString());
	}

}
