package org.fedoravdeev.task05.collection;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProxyCacheCollectionStringTest {
	
	@Mock
	CollectionString storeCollectionString;
	
	@InjectMocks
	CollectionString proxyCacheCollectionString = mock(ProxyCacheCollectionString.class);
	
	@Test
	public void shouldGetCountUniqueCharactersFromProxy () {		
		proxyCacheCollectionString.getString("hello world!");
		ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
		verify(proxyCacheCollectionString).getString(argumentCaptor.capture());
	}
}