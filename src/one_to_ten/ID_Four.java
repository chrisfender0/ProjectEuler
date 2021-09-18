package one_to_ten;

import java.util.ArrayList;

public class ID_Four {

	public static void main(String[] args) {
		ArrayList<Integer> pali = iterateThroughProductsOfTwos();
		pali.stream().sorted().forEach(System.out::println);
	}
	
	static boolean isPalindrome(int num) {
		String str = String.valueOf(num);
		int i=0; int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	static ArrayList<Integer> iterateThroughProductsOfTwos() {
		ArrayList<Integer> pali = new ArrayList<Integer>();
		for(int i=999; i>1; i--) {
			for (int j=999; j>1; j--) {
				String s_i = String.valueOf(i);
				String s_j = String.valueOf(j);
				if(s_i.length() == 3 && s_j.length() == 3) {
					if(isPalindrome(i*j)) {
						System.out.println("i is " + i);
						System.out.println("j is " + j);
						System.out.println("palindrome is equal to " + (i * j));
						pali.add(i*j);
					}
				}
			}
		}
		return pali;
	}

}
