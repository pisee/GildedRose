package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;


public class GildedRoseTest {

	@Test
	public void GildedRose_should_not_update_anything_when_no_item(){
		Item[] items = new Item[]{};
		GildedRose gildedRose = new GildedRose(items );
		
		gildedRose.updateQuality();
	}
	
}
