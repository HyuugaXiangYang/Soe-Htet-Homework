package Day3test;

public class bitManipulationOperators {
	public static void main(String[] args) {
		
		int ope1 = 84;
		int ope2 = 327;
		
		int rz1 = ope1 & ope2; //bitwise AND. only binary 1 + 1 is 1.
		int rz2 = ope1 | ope2; //bitwise OR. if binary 1 include it result in 1.
		int rz3 = ope1 ^ ope2; //bitwise XOR. result in binary 1 if two binary is different.
		int rz4 = ~ope2; //NOT. bitwise complement. positive become negative. negative become positive.
		
		System.out.println(rz1 + " " + rz2 + " " + rz3 + " " + rz4);
	}
}
