package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new		 CustomerManager();
	//		I				I			   I				I
	// REFERENCE TYPE | VARIABLE NAME  | METHOD	| DECLARE IN MEMORY (RAM).
	// DECLARED LEFT HAND IN STACK 		=	DECLARED RIGHT HAND IN HEAP	
	// EXAMPLE:
	// ASSUME THAT LEFTHAND IN STACK IT WILL TAKE 101 REFERENCE NUMBER IN STACK....
	// ON THE OTHERHAND IN THE RIGHT HAND, IT WILL DECLARE EMPTY AREA IN HEAP FOR DATA INFOS.
	// Let's declare another CustomerManager.
		CustomerManager customerManager2 = new CustomerManager(); // 102 area.
	// Then we will transfer our stack which we hold on place such as 101. it will go 102 and 101 will be empty on heap area.
	// Garbage collector will work for heap to delete it...
	// Because new is super costly for programming.
		customerManager = customerManager2;
		// all infos in 102.
		
		// setter
		customerManager.setName("James");

		// getters
		customerManager.add();
		customerManager.delete();
		customerManager.update();
		System.out.println(customerManager.getName());
		
		// because it is (primitive) value type.
		int number1 = 10;
		int number2 = 20; // it will delete :) next line.
		number2 = number1; // which already had location number 1 to number to on the stack. and number2 is 10;
		System.out.println(number1); // you will see that all information clearly. There is no way to work with heap for primitive data type.
		number1 = 30; // number1 is 30
		System.out.println(number2); // output will be 10
		
		// all arrays are reference type.
		int [] numbers1 = new int [] {1,2,3};
		int [] numbers2 = new int[] {4,5,6};
		numbers2  = numbers1; // now we have same location on the stack.
		System.out.println(numbers1[0]);
		System.out.println(numbers2[0]); 
		numbers1[0] = 10; // change the numbers1's 0. element on the numbers1. it will automatically change numbers2's 0. element.
		System.out.println(numbers1[0]);
		System.out.println(numbers2[0]);

	}

}
