import java.util.ArrayList;
import java.util.Arrays;

public class PsudoCodeTester extends DiscreteOperations {
	public static void main(String[] args) {
		System.out.println("Hello and welcome this is the testing code for my implementation of the current PsudoCode!");
		
		DiscreteOperations DO = new DiscreteOperations();
		
		
		//init first array
		int arrayOne[] = {1, 3, 4, 5, 5, 7, 8};
		ArrayList<Integer> ListOne = new ArrayList<Integer>(7);
		for(int i = 0; i < 7; i ++) {
			ListOne.add(arrayOne[i]);
		}
		
		//init second array
		int arrayTwo[] = {2, 2, 3, 5, 7};
		ArrayList<Integer> ListTwo = new ArrayList<Integer>(6);
		for(int i = 0; i < 5; i ++) {
			ListTwo.add(arrayTwo[i]);
		}
		
		ArrayList<Integer> a = DO.exclusiveOr(ListOne, ListTwo);
		
		
		printArrayList(ListOne);
		
		//the array list we care about should be {1,2,4,8}
		printArrayList(a);
		
	}
	
	//Description: printArrayList will print the array list on one line;
	//Input: An ArrayList of integers is the input.
	//Output: Static Void.
	public static void printArrayList(ArrayList<Integer> arrayOne) {
		String st = ", ";
		
		for(int i = 0; i < arrayOne.size(); i ++) {
			// set the st char to empty if last element.
			if(i == arrayOne.size() - 1){st = "";}
			System.out.print(arrayOne.get(i)+ st);
			
		}
		System.out.println("");
	}
}
