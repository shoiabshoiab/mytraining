package module1;

public class ArrayDemo {
	public static void main(String[] args) {
		int a[]=new int[5];
		int b[][]=new int[3][4];
		
		for(int i=0;i<a.length;i++) {
		//	System.out.println(a[i]);
		}
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
		//		System.out.print(b[i][j]+"\t");
			}
		//	System.out.println("\n");
		}
		//enhanced for loop
		for(int i:a) {
		//	System.out.print(i+"\t");
		}
		for(int i[]:b) {
			for(int j:i) {
				System.out.print(j+"\t");
			}
			System.out.println("\n");
			
		}
		
		int arr[]= {1,2,3,4,5};
		int arr2d[][]={
				{1,2,3,4},
				{3,5,7,8},
				{5,6,7,8}
		};
	}
}
