package org.fedoravdeev.task05.collection;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class StoreCollectionString implements CollectionString {
	private static final String QUOTATION = "\"";
	private static final String QUOTATION_MINUS = "\" - ";
	private static final String END_STRING = "\n";

	@Override
	public String getString(String input) {
		
		StringBuilder result = new StringBuilder();
		for (Entry<Character, Integer> mapEntry : getCountUniqueCharacters(input).entrySet()) {
			result
				.append(QUOTATION)
				.append(mapEntry.getKey())
				.append(QUOTATION_MINUS)
				.append(mapEntry.getValue())
				.append(END_STRING);
		}
		return result.toString();
	}

	private LinkedHashMap<Character, Integer> getCountUniqueCharacters(String input) {

		LinkedHashMap<Character, Integer> mapCharCount = new LinkedHashMap<>();
		for (char ch : input.toCharArray()) {
			if (mapCharCount.containsKey(ch)) {
				mapCharCount.put(ch, mapCharCount.get(ch) + 1);
			} else {
				mapCharCount.put(ch, 1);
			}
		}
		return mapCharCount;
	}

	public String getResultUniqueCharacters(String[] args) {
		StringBuilder result = new StringBuilder();
		for (String arg : args) {
			result
				.append(getString(arg))
				.append(END_STRING);
		}
		return result.toString();
	}
}
