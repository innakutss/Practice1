package ua.edu.sumdu.j2se.pr1;

import ua.edu.sumdu.j2se.pr1.operations.Operation;

public class MainClass {
	/**
	* Main method to print exponents of numbers from 1 to 10
	* @param takes array of Strings
	* @return method is void
	*/
    public static void main(String[] args) {
		
	for (int x = 1; x < 10; x++) {
				
	for (int y = 1; y < 10; y++) {
					
		Operation operation = new Operation(x, y);
					
		System.out.printf("% 3d", operation.getResult());
	}
				
		System.out.println();
	}
    }
}		
