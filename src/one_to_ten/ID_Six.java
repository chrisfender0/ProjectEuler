package one_to_ten;

public class ID_Six {

	public static void main(String[] args) {
		System.out.println(difference(100));
	}
	
	static int sumOfSquares(int max) {
		int result = 0;
		for (int i=1; i<=max; i++) {
			result += Math.pow(i, 2);
		}
		return result;
	}
	static int squareOfSum(int max) {
		int result = 0;
		for(int i=1; i<=max; i++) {
			result += i;
		}
		return (int) Math.pow(result, 2);
	}
	static int difference(int max) {
		return squareOfSum(max)-sumOfSquares(max);
	}

}
