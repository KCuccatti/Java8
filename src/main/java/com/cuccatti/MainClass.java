package com.cuccatti;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 *  This creates an instance of a class that I created that implements NumberAdd Inteface.  
		 *  I could then use this on line 11 and will get 20 printed out.
		 */
		NumberAdd addNums = new NumberAddImpl(); 
		System.out.println(addNums.add(15, 5));
		
		/*
		 * However, I don't have to create a new class to achieve the above. Instead of creating a class (NumberAddImpl) for just
		 * the purpose of implementing an interfaces' method, I could have used an anonymous inner class to avoid creating unnecessary classes:
		 * The below is an inline implementation of an interface. Also referred to as an anonymous inner class. It is a class that were defining 
		 * inside another class (inner) and it does not have a name (anonymous).
		 */
		NumberAdd innerClassNumberAdd = new NumberAdd() {
			/*
			 * Define implementation right here. This will implicitly use autoboxing to cast the int arguments I 
			 * passed to corresponding wrapper Integer type(non-Javadoc)
			 */
			@Override
			public Integer add(int a, int b) {
				return a + b;
			}
		};
		
		/*
		 *  Will still get 20. Now, innerClassNumberAdd can be used throughout this class containing an implementation of an interface
		 *  without needing to create another class for that.
		 */
	
		innerClassNumberAdd.add(15, 5);
		
		// Now I will crate a lambda expression which is a shortcut for the inner class but not just a shortcut. There are differences.
		NumberAdd addTwoNums = (int x, int y) -> {
			return x + y;
		};
		addTwoNums.add(2, 3);
	}
}
