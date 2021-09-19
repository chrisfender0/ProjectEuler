package one_to_ten;

public class ID_Nine {

	public static void main(String[] args) {
		int a=1, b=2, c=3, target=1000;
		for(a=1; a<target; a++) {
			for(b=2; b<target; b++) {
				for(c=3; c<target; c++) {
					if(a+b+c==target) {
						if(isTriplet(a,b,c)) {
							if(pytha(a,b)==Math.pow(c, 2)) {
								System.out.println("a= " +a);
								System.out.println("b= " +b);
								System.out.println("c= " +c);
								System.out.println("a+b+c==" + (a+b+c));
								System.out.println("Product of a*b*c =" + (a*b*c));
							}
						}
					}
				}
			}
		}
	}

	static int pytha(int a, int b) {
		return (int)((Math.pow(a, 2))+(Math.pow(b, 2)));
	}
	
	static boolean isTriplet(int a, int b, int c) {
		if(a < b && b < c) {
			return true;
		}
		return false;
	}
	
	
}
