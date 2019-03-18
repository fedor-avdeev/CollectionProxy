package org.fedoravdeev.task05.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StoreCollectionStringTest {
	
	@Test
	@DisplayName("should get count empty string")
	public void shouldGetCountEmptyString() {
		CollectionString collectionString = new StoreCollectionString();
		String actual = "";
		String expected = "";
		assertEquals(expected, collectionString.getString(actual));
	}
	
	@Test
	@DisplayName("should get count of unique characters from one string")
	public void shouldGetCountUniqueCharacters() {
		CollectionString collectionString = new StoreCollectionString();
		String actual = "hello world!";
		String expected = "\"h\" - 1\n" +
				"\"e\" - 1\n" +
				"\"l\" - 3\n" +
				"\"o\" - 2\n" +
				"\" \" - 1\n" +
				"\"w\" - 1\n" +
				"\"r\" - 1\n" +
				"\"d\" - 1\n" +
				"\"!\" - 1\n";
		assertEquals(expected, collectionString.getString(actual));
	}
	
	@Test
	@DisplayName("should get result of unique characters from array of strings")
	public void shouldGetResultUniqueCharactersArrayString() {
		StoreCollectionString storCollectionString = new StoreCollectionString();
		String[] actual = { "hello world!", "hello, world", "hello world!", "hello" };
		String expected = "\"h\" - 1\n" +
				"\"e\" - 1\n" +
				"\"l\" - 3\n" +
				"\"o\" - 2\n" +
				"\" \" - 1\n" +
				"\"w\" - 1\n" +
				"\"r\" - 1\n" +
				"\"d\" - 1\n" +
				"\"!\" - 1\n" +
				"\n" +
				"\"h\" - 1\n" +
				"\"e\" - 1\n" +
				"\"l\" - 3\n" +
				"\"o\" - 2\n" +
				"\",\" - 1\n" +
				"\" \" - 1\n" +
				"\"w\" - 1\n" +
				"\"r\" - 1\n" +
				"\"d\" - 1\n" +
				"\n" +
				"\"h\" - 1\n" +
				"\"e\" - 1\n" +
				"\"l\" - 3\n" +
				"\"o\" - 2\n" +
				"\" \" - 1\n" +
				"\"w\" - 1\n" +
				"\"r\" - 1\n" +
				"\"d\" - 1\n" +
				"\"!\" - 1\n" +
				"\n" +
				"\"h\" - 1\n" +
				"\"e\" - 1\n" +
				"\"l\" - 2\n" +
				"\"o\" - 1\n\n";
		assertEquals(expected, storCollectionString.getResultUniqueCharacters(actual));
	}
}
