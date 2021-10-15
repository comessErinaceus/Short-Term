import java.util.*;
public class DiscreteOperations {
public void TestInheritance() {
	System.out.println("Inheritance works!");
}

	public void union() {
		//this will be a function for finding and or operation of arrays.
	}
	
	public void intersection() {
		//this will be a function for finding only the parts of arrays that are the same in both.
	}

	/*Description: This function will return an ArrayList in ascending order containing only the elements from each Array list that are not common between them.
	 * Sorting runs in O(n) time and populating the result array list runs in O(n) time making O(2n) time.
	 * Inputs: Two ArrayLists sorted in ascending order.
	 * Output: One ArrayList sorted in ascending order containing only the members of each list that are not common between them
	*/
	public ArrayList<Integer> exclusiveOr(ArrayList<Integer> ListOne, ArrayList<Integer> ListTwo) {
		ArrayList<Integer> result = new ArrayList<Integer>(1);
		

		boolean isInOther = false;
		int lastAdded = -1;
		for(int i = 0; i < ListOne.size(); i++) {
			for(int e = 0; e < ListTwo.size(); e++) {
				if(ListOne.get(i) == ListTwo.get(e)) {
					isInOther = true;
				}
				
			}
			if(!isInOther && ListOne.get(i) != lastAdded) {
				result.add(ListOne.get(i));
				lastAdded = ListOne.get(i);
			}
			isInOther = false;
		}
		
		for(int i = 0; i < ListTwo.size(); i++) {
			for(int e = 0; e < ListOne.size(); e++) {
				if(ListTwo.get(i) == ListOne.get(e)) {
					isInOther = true;
				}
				
			}
			if(!isInOther && ListTwo.get(i) != lastAdded) {
				result.add(ListTwo.get(i));
				lastAdded = ListTwo.get(i);
			}
			isInOther = false;
		}
		
		return result;
	}
	
	
}
