package ch03;

public class FunctionTest {
	//반환값도 있고 매개변수도 있는 경우
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	//반환값은 없고 매개변수가 있는 경우
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	//반환값은 있고 매개변수가 없는 경우
	public static int calcSum() {
		int sum = 0;
		int i;
		
		for(i = 0; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		
		sayHello("안녕하세요");
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);
	}

}	
