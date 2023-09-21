package SuperKey;
class Animal{
	String colour = "white";
	int x=10;
	char c='S';


}

class Dog extends Animal{
	String colour = "Black";
	int x=20;
	char c='f';
	
	void show() {
		System.out.println(colour);
		System.out.println(x);
		System.out.println(c);
		System.out.println(super.colour);
		System.out.println(super.x);
		System.out.println(super.c);
	}
}
public class KeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		//d.display();
		d.show();

	}

}
