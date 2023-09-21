package OverLoading;


class Parent{
	int x;
	int y;
	
	void sum() {
		System.out.println(x+y);
	}
}
class Child extends Parent{
	void mul() {
		System.out.println(x*y);
	}
}
class Child1 extends Parent{
	void sub() {
		System.out.println(x-y);
	}
}

public class Hierar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Child1 c1=new Child1();
		c1.x=10;
		c1.y=20;
		c1.sum();
		c1.sub();*/
		
		Child c=new Child();
		c.x=30;
		c.y=40;
		c.mul();

	}

}
