package test.collections.list;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.collections.list.ListUtils;

class ListUtilsTests {

	@Test
	void createLinkedList() {
		// Arrange
		LinkedList<String> expectedResult = new LinkedList<>(List.of("This", "is", "my", "first", "LinkedList"));

		// Act
		List<String> actualResult = ListUtils.createLinkedList();

		// Assert
		assertEquals(expectedResult, actualResult);
		assertEquals(LinkedList.class, actualResult.getClass());
	}

	@Test
	void getFifthElement() {
		// Arrange
		List<Integer> integerList = List.of(0, 1, 2, 3, 4, 5, 6);
		Integer expectedResult = 4;

		// Act
		Integer actualResult = ListUtils.getFifthElement(integerList);

		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void getFifthElementIndexOutOfBoundsException() {
		// Arrange
		List<Integer> integerList = List.of(0, 1, 2, 3);

		// Act & Assert
		assertThrows(IndexOutOfBoundsException.class, () -> ListUtils.getFifthElement(integerList));
	}

	@Test
	void sortAscending() {
		// Arrange
		List<Integer> integerList = new ArrayList<>(List.of(6, 0, 1, 2, 5, 4, 3));
		List<Integer> expectedResult = List.of(0, 1, 2, 3, 4, 5, 6);

		// Act
		List<Integer> actualResult = ListUtils.sortAscending(integerList);

		// Assert
		assertEquals(expectedResult, actualResult);
	}
	

}
