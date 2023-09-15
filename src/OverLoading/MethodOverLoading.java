package OverLoading;

   class Ab{
	   int a ;
	   int b;
	   
	   void display(int a, int b) {
		   this.a=a;
		   this.b=b;
		   
	   }
   
   void sum() {
	   System.out.println(a+b);
   }
   }
   class Bb{
	   int x;
	   String na;
	   void display(int x, String na) {
		   this.x=x;
		   this.na=na;
	   }
	   void show() {
		   System.out.println(x);
		   System.out.println(na);
	   }
   }



public class MethodOverLoading {

	public static void main(String[] args) {
		//OverLoading o=new OverLoading();
		Ab ab=new Ab();
		ab.a=10;
		ab.b=20;
		ab.sum();
		
		Bb b=new Bb();
		b.x=40;
		b.na="hahahaha";
		b.show();
		

	}

}
