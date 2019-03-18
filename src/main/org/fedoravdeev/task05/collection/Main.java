package org.fedoravdeev.task05.collection;

public class Main {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please will be adding string parameter. For example: hello world! ");
			return;
		}
		CollectionString collectionStringCache = new ProxyCacheCollectionString(new StoreCollectionString());
		System.out.println(collectionStringCache.getString(args[0]));
	}
}