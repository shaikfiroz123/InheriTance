package Inheritance;

class A{
	int x=10;
	int y=20;
	void add() {
		System.out.println(x+y);
	}
}
class B extends A{
	void sub() {
		System.out.println(x-y);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.add();
		b.sub();

	}

}
