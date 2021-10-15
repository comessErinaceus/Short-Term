import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DiscreteOperationsTest extends DiscreteOperations{

	@Test
	public void exclusiveOr() {
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
				
				assertNotNull(a);
				//{1, 2, 4, 8}
				int[] testArray = {1,2,4,8};
				for(int i = 0; i < testArray.length; i++) {
					assertEquals(a.get(i), testArray[i]);
				}
				
				
	}

}
