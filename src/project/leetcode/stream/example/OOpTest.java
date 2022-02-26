package project.leetcode.stream.example;

public class OOpTest {

	public static void main(String[] args) {
		
			new Child().test();
		
			
			
			
	}

}


class Parent{
	
	public static void test() {
		System.out.println("parent -test");
	}
}

class Child extends Parent{
	public  void test(int a) {
		System.out.println("Child -test");
	}
}

