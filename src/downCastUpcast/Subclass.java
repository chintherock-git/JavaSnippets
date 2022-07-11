package downCastUpcast;

public class Subclass extends Superclass{
	
	int a=100;
//  Overridden method of the superclass
	public  void run(){
		System.out.println("This is the method defined in sub class the overidden method ");
	}
	
	public  void print() {
		System.out.println("This is the print method of sub class");
	}
	
	public void mymethod() {
		System.out.println("This is mymthod in subclass");
	}
}
