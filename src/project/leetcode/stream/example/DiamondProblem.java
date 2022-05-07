package project.leetcode.stream.example;

interface A {
	
	public default  void print() {
		System.out.println("A");
	}
}
interface  B {
	
	public default  void print() {
		System.out.println("B");
	}
}
public class DiamondProblem  implements A,B{

	
	public static void main(String[] args) {
		
		A b = new DiamondProblem();
		b.print();
//		

	}

	@Override
	public void print() {
		
		B.super.print();
	}

}
