package one_to_ten;

public class ID_Five {

	public static void main(String[] args) {
		System.out.println(iterateThroughNums());
	}
	
	static boolean hasNoRemainder( int num) {
		for(int i=20; i>1; i--) {
			if(num % i != 0) {
				return false;
			}
		}
		return true;
	}
	
	static int iterateThroughNums() {
		for(int i=1; i<Integer.MAX_VALUE; i++) {
			if(hasNoRemainder(i)) {
				return i;
			}
		}
		return 0;
	}

}
