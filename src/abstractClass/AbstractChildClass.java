package abstractClass;

public class AbstractChildClass extends AbstractClass {

	@Override
	public void mymethod() {
		// TODO Auto-generated method stub
		
		System.out.println("Providing the implementation of  the abstract method for the superclass");
		
	}
	public static void main(String[]args) {
		AbstractChildClass child = new AbstractChildClass();
		child.mymethod();
		child.concrete();
		System.out.println("Value of the variable from the superclass is "+child.a);
	}

}
