package module1;

public class SwitchCaseDemo {
public static void main(String[] args) {
	int i=40;
	int c='a';
	String s="hello";
	
	switch(s) {
	case "hello":{
		System.out.println("the value is hello");
		break;
	}
	case "world":{
		System.out.println("the value is world");
		break;
	}
	default:
		System.out.println("none of the condition is satisfied...");
	}
}
}
