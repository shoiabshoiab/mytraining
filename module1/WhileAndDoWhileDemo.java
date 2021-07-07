package module1;

public class WhileAndDoWhileDemo {
	public static void main(String[] args) {
		int i=0;
		while(i<10) {
			System.out.println("i value is...:"+i);
			i++;
		}
		
		do {
			System.out.println("Do-While...I value is..:"+i);
		}while(i>10);
	}
}
