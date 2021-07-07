package module1;

public class BreakDemo {
	
	public static void main(String[] args) {
		boolean t=true;
		//first label
		first:{
				System.out.println("first block.....");
			second:{
				System.out.println("second block....");
				third:{
					System.out.println("third block....");
					if(t) {
						break second;
					}
						//break will take the control out of second label...
						System.out.println("after the break - ");//this is will not get printed...
					}
				System.out.println("second block second line...");
				}
			System.out.println("first block second line....");
			}
		}	
		
}
