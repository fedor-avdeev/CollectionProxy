package org.fedoravdeev.task05.collection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.atLeastOnce;

import org.junit.Test;
import org.junit.runner.RunWith;
//import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProxyCacheCollectionStringTest {
	
	@Mock
	private CollectionString storeCollectionString = mock(StoreCollectionString.class);
	
	@InjectMocks
	private CollectionString proxyCacheCollectionString = new ProxyCacheCollectionString(storeCollectionString); // = mock(ProxyCacheCollectionString.class);
	
	@Test
	public void shouldGetCountUniqueCharactersFromProxy () {
		
		storeCollectionString.getString("hello world!");
		proxyCacheCollectionString.getString("hello world!");
		
		when(proxyCacheCollectionString.getString("hello world!"))
		.thenReturn("\"h\" - 1\n" +
		"\"e\" - 1\n" +
		"\"l\" - 3\n" +
		"\"o\" - 2\n" +
		"\" \" - 1\n" +
		"\"w\" - 1\n" +
		"\"r\" - 1\n" +
		"\"d\" - 1\n" +
		"\"!\" - 1\n");
		
		verify(proxyCacheCollectionString, atLeastOnce()).getString("hello world!");
		
		//verify(proxyCacheCollectionString).callMethod(Matchers.eq(concrete_object));
		//InOrder inOrder = Mockito.inOrder(storeCollectionString);
		//inOrder.verify(storeCollectionString).getString("hello world!");

	}
}