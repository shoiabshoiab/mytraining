package module1;

public class IfElseIfDemo {
	public static void main(String[] args) {
		int i=Integer.parseInt(args[0]);
		
		if(i==10) {
			System.out.println("The I value is 10");
			System.out.println("the second line....");
		}
		else if(i==20) {
			System.out.println("The I value is 20");
		}
		else if(i==30) {
			System.out.println("The I value is 30");
		}
		else {
			System.out.println("The I value does not match any condition..");
		}
	}
}
