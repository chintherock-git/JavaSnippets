package rs_Interface;

public class Sample_implementation implements SampleInterface{
	public void checkPalindrome(String s) {
		String s_copy="";
		for (int i=s.length()-1;i>=0;i--) {
		s_copy=s_copy+s.charAt(i);
		}
		System.out.println("The reverse of the string is "+s_copy);
		if(s.equals(s_copy)) 
			System.out.println("The String is a Palindrome");
		else
			System.out.println("The String is not a Palindrome");
	}
	
	public void displayArrayElements() {
		
		//dont declare and initialize 2d array in same line
		
		int a[][]= {{3,4,5},{1,2,3},{8,9,10}};
		 int b[][]= new int[3][3];
		 
		 for(int i=0;i<3;i++){
			 for(int j=0;j<3;j++) {
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println();
		 }
	
		 int number=5;
		 for(int i=0;i<3;i++){
			 for(int j=0;j<3;j++) {
				 
				 b[i][j]=number;
				 number+=5;
			 }
		 }
		 
		 System.out.println("Printing b");
		 
		 for(int i=0;i<3;i++){
			 for(int j=0;j<3;j++) {
				 System.out.print(b[i][j]+" ");
			 }
			 System.out.println();
		 }
		
		
	}
	
	public static void main(String[]args) {
		SampleInterface ss = new Sample_implementation();
		ss.checkPalindrome(ss.reverse);
		ss.displayArrayElements();
	}

	

}
