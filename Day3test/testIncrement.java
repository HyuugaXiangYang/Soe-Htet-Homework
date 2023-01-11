package Day3test;

public class testIncrement {

	public static void main(String[] args) {
		int i = 1; 
		int ilnc;
		
		ilnc = i++; //postfix increment
		
		System.out.println("Postfix increment ilnc is " + ilnc); //the value of ilnc remains 1 since it is postfix.
		System.out.println("Postfix increment i is " + i); //however the value of i increased by 1 after the increment.
		
		ilnc = ++i; //prefix increment
		
		System.out.println("Prefix increment ilnc is " + ilnc); //this time the value of ilnc is increased by i += 1.
		System.out.println("Postfix increment i is " + i); //the value of i is yet increased again in both cases.
		
	}

}
