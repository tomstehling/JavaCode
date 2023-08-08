package test.collections.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.junit.jupiter.api.Test;

import main.collections.map.MapUtils;

class MapUtilsTests {

	@Test
	void createShoppingList() {
		// Arrange
		Map<String, Integer> expectedResult = Map.of("milk", 5, "bread", 3, "honey", 1);

		// Act
		Map<String, Integer> actualResult = MapUtils.createShoppingList();

		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void getKeys() {
		// Arrange
		Map<String, Integer> stringToIntegerMap = Map.of("milk", 5, "bread", 3, "honey", 1);
		Set<String> expectedResult = Set.of("milk", "bread", "honey");

		// Act
		Set<String> actualResult = MapUtils.getKeys(stringToIntegerMap);

		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void getBiggestValue() {
		// Arrange
		Map<String, Integer> stringToIntegerMap = Map.of("milk", 5, "bread", 3, "honey", 1);
		Integer expectedResult = 5;

		// Act
		Integer actualResult = MapUtils.getBiggestValue(stringToIntegerMap);

		// Assert
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void getBiggestValueNoSuchElementException() {
		// Arrange
		Map<String, Integer> stringToIntegerMap = Collections.emptyMap();

		// Act & Assert
		assertThrows(NoSuchElementException.class, () -> MapUtils.getBiggestValue(stringToIntegerMap));
	}

}
