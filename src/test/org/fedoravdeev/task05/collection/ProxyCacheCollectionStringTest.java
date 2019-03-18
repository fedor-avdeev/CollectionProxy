package org.fedoravdeev.task05.collection;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class ProxyCacheCollectionStringTest {

	CollectionString proxyCacheCollectionString = mock(ProxyCacheCollectionString.class);
    @Test
    public void shouldGetCountUniqueCharactersFromProxy () {      	
    	
    	when(proxyCacheCollectionString.getString("hello world!")).thenReturn("\"h\" - 1\n" +
				"\"e\" - 1\n" +
				"\"l\" - 3\n" +
				"\"o\" - 2\n" +
				"\" \" - 1\n" +
				"\"w\" - 1\n" +	
				"\"r\" - 1\n" +	
				"\"d\" - 1\n" + 
				"\"!\" - 1\n"); 
	
    	assertEquals(proxyCacheCollectionString.getString("hello world!"),"\"h\" - 1\n" +
				"\"e\" - 1\n" +
				"\"l\" - 3\n" +
				"\"o\" - 2\n" +
				"\" \" - 1\n" +
				"\"w\" - 1\n" +	
				"\"r\" - 1\n" +	
				"\"d\" - 1\n" + 
				"\"!\" - 1\n"); 

    	
    	verify(proxyCacheCollectionString).getString("hello world!");
    }
