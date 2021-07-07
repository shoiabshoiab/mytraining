package module2;

public class OperatorsDemo {
	public static void main(String[] args) {
		int a=10;
		int b=10;
		//addition Operator
		System.out.println("a + b ="+ (a+b));
		System.out.println("a - b ="+ (a-b));
		System.out.println("a * b ="+ (a*b));
		System.out.println("a / b ="+ (a/b));
		System.out.println("a mod ob b="+(a%b));
		
		//assignment operators
		
		int temp;
		temp=a;
		System.out.println("value of temp...:"+temp);
		
		//assign using =+
		
		temp +=a; //temp=temp+a
		
		System.out.println("value of temp..:"+temp);
		
		temp *=a;//temp=temp*a;
		System.out.println("value of temp..:"+temp);
		
		//==, !=, >, <. >=, <=
		
		System.out.println(" a is equal to b..:"+(a==b));
		System.out.println(" a is Not equal to b..:"+(a!=b));
		System.out.println(" a is greater to b..:"+(a>b));
		System.out.println(" a is lesser to b..:"+(a<b));
		System.out.println(" a is greater or equal to b..:"+(a>=b));
		System.out.println(" a is lesser or equal to b..:"+(a<=b));
		
		//logical operators - &&, ||, !
		System.out.println((a>b)&&(b<20));
		System.out.println((a>b)||(b<20));
		
		//unary operator - increment and decrement
		
		System.out.println("value of a..:"+ ++a);
		System.out.println("value of b..:"+ --b);
		
		//instanceof operator
		
		String str="hello world";
		B obj=new B();
		
		boolean result=obj instanceof B;
		result=obj instanceof B;
		
		if(obj instanceof B)	{
			System.out.println("str is of string type...");
		}
		
		//ternary operator
		
		String re=(obj instanceof B) ? "yes instanceof B":"No not a instanceof B";
		System.out.println(re);
	}
}
class A{}
class B{}
