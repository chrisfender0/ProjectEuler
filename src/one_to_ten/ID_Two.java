package one_to_ten;

public class ID_Two {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1;
		int sum = 0;
		while(num1 <= 4000000) {
			if(num1 %2 == 0) {
				sum += num1;
			}
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
		}
		System.out.println(sum);
	}
}
