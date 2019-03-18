package org.fedoravdeev.task05.collection;

import java.util.LinkedHashMap;

public class ProxyCacheCollectionString implements CollectionString {
	
	private final CollectionString collectionString;
	private final LinkedHashMap<String, String> mapCachedStrings = new LinkedHashMap<>();
	
	public ProxyCacheCollectionString(CollectionString collectionString) {
		this.collectionString = collectionString;
	}
	
	@Override
	public String getString(String input) {
		if (!mapCachedStrings.containsKey(input)) {
			setCacheString(input);
		}
		return mapCachedStrings.get(input);
	}
	
	private void setCacheString(String keyString) {
		mapCachedStrings.put(keyString, collectionString.getString(keyString));
	}
}
