package br.eti.clairton.paginated.collection;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class PaginatedMetaListTest {
	private final Meta meta = new Meta(2l, 1l);
	PaginatedMetaList<String> list = new PaginatedMetaList<String>(
			Arrays.asList("1"), meta);

	@Test
	public void testGetMeta() {
		assertEquals(Long.valueOf(2l), list.getMeta().getTotal());
		assertEquals(Long.valueOf(1l), list.getMeta().getPage());
	}

	@Test
	public void testUnwrap() {
		assertEquals(meta, list.unwrap(Meta.class));
	}
}
