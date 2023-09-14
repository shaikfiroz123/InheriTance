package Inheritance;

class Akas{
	int a=20;
	int b=30;
	void add() {
		System.out.println(a+b);
	}
}
class Bakas extends Akas{
	void sub() {
		System.out.println(a-b);
	}
}
class Chakas extends Bakas{
	void mul() {
		System.out.println(a*b);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chakas c=new Chakas();
		c.add();
		c.sub();
		c.mul();

	}

}
