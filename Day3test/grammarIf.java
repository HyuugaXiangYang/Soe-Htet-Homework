package day_4;

public class grammarIf {

	public static void main(String[] args) {
		
		if(args.length > 0) {
			System.out.println("Hello" + args[0]);
		}else {
			System.out.println("You must pass a parameter!");
		}

	}

}
