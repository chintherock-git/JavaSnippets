package downCastUpcast;
public class UpcastDownCast {
	
	
	//Variable hiding and method overriding

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superclass superclass1= new Superclass();
		superclass1.print();
		superclass1.run();
		
		//Accessing sub class methods
		
		Superclass  superclass2= new Subclass();
		superclass2.print();
		superclass2.run();
		superclass2.run_super();
		//superclass2.mymethod();
		
		
		//Because variables in Java do not follow polymorphism and overriding is only applicable to 
		//methods but not to variables. And when an instance variable in a child class has the same name as an instance variable in a parent class, 
		//then the instance variable is chosen from the reference type.
		//calls value as per  the reference type
		System.out.println("Value of a is "+superclass2.a);
		
		//to call child variable casting is done in the
		System.out.println("Value of a is "+((Subclass)superclass2).a);
		
		//Reference of parent class cannot access the child class method
		//superclass2.mymethod();
		
		//Assigning subclass object to superclass reference is called upcasting
		//Below will give compilation error because only that downcast object can be upcast
		
		
		//Overridden Method in subclass has no visibility by the UpCast Object
		//if we do not upcast there is no need to downcast
		//superclass2.mymethod();
		Subclass s= (Subclass)superclass2;
		s.mymethod();
		System.out.println("Value of a is "+s.a);
		
		//to call child variable casting is done in the
		System.out.println("Value of a is "+((Superclass)s).a);
		
		//Accessing super class methods
		
		//to Access not the overidden method of child class we need downcasting
		//below is downcasting
		
		Subclass subclass1 =(Subclass)superclass2;
		System.out.println("********************************************");
		subclass1.run_super();
		
		Subclass subclass2= (Subclass)superclass2;
		subclass2.print_super();
		subclass2.run_super();
		subclass2.mymethod();
		
		
		}

}
