package one_to_ten;

import java.util.ArrayList;

public class ID_Seven {

	public static void main(String[] args) {
		ArrayList<Integer> primes = primeFactory();
		System.out.println(primes.get(10000) + " " + primes.get(0));
	}
	
	static ArrayList<Integer> primeFactory() {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i=2; i<200000; i++) {
			if(isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}
	
	static boolean isPrime(int num) {
		for (int i=2; i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
