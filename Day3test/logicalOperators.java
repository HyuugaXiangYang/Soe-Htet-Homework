package Day3test;

public class logicalOperators {
	public static void main(String[] args) {

		int i = 100;
		int j = 21;
		boolean b = i == 100 & j < 50; //true if op1 and op2 are true
		boolean c = i == 100 | j > 1000; //true if op1 or op2 are true
		boolean d = i == 55 ^ j < 33; //true if op1 and op2 are different
		
		System.out.println(b + " " + c + " " + d);
		
	}
}
