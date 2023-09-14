package Inheritance;

class Parent{
	int a=40;
	int b=50;
	void add() {
		System.out.println(a+b);
	}
}
class Child1 extends Parent{
	void sub() {
		System.out.println(a-b);
	}
}
class Child2 extends Parent{
	void mul() {
		System.out.println(a*b);
	}
}

public class HierarchalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c2=new Child2();
		c2.add();
		c2.mul();
		
		Child1 c1=new Child1();
		c1.add();
		c1.sub();

	}

}
