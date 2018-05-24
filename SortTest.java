import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortTest {

	@Test
	void test() {
		Sort s = new Sort();
		
		int[] list = {7, 4, 6, 2, 0, 9, 8, 5, 3, 1};
		int[] list2 = {7, 4, 6, 2, 0, 9, 8, 5, 3, 1};
		
		s.bubbleSort(list);
		for(int i = 0; i < list.length; i++) {
			assertTrue(list[i] == i);
		}
		
		s.insertionSort(list2);
		for(int i = 0; i < list2.length; i++) {
			assertTrue(list2[i] == i);
		}
	}

}
