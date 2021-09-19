package one_to_ten;

import java.math.BigInteger;
import java.util.ArrayList;

public class ID_Three {

	public static void main(String[] args) {
		//BigInteger num = new BigInteger("600851475143");
		BigInteger num = new BigInteger("8462696833");
		System.out.println(treePrimeFactorication(num));
	}
	
	static BigInteger treePrimeFactorication(BigInteger num) {
		ArrayList<Integer> primes = primeFactory();
		for (Integer integer : primes) {
			BigInteger prime = BigInteger.valueOf(Integer.valueOf(integer));
			if(num.mod(prime).equals(BigInteger.ZERO)) {
				System.out.println("divided by this prime: "+prime);
				System.out.println("got this num: "+num.divide(prime).toString());
				return treePrimeFactorication(num.divide(prime));
			}
		}
		return null;
	}
	
	static ArrayList<Integer> primeFactory() {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i=2; i<10000; i++) {
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
