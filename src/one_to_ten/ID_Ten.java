package one_to_ten;

import java.util.ArrayList;

public class ID_Ten {

	public static void main(String[] args) {
		ArrayList<Long> primes = primeFactory();
		long result = 0;
		for (Long long1 : primes) {
			result += long1;
			System.out.println("Current total =" + result);
		}
		System.out.println("Regular loop result: " + result);
		System.out.println("Streams result ="+primes.stream().reduce((long) 0, (x, y)-> x+y));
	}
	
	static ArrayList<Long> primeFactory() {
		ArrayList<Long> primes = new ArrayList<Long>();
		int counter = 1;
		for(long i=2; i<2000000; i++) {
			if(isPrime(i)) {
				primes.add(i);
				System.out.println("added the "+counter +"th prime= [" + i +"]");
				counter ++;
			}
		}
		return primes;
	}
	
	static boolean isPrime(long num) {
		for (long i=2; i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
