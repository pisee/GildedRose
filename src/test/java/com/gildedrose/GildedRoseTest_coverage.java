package com.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class GildedRoseTest_coverage {

	@Test
	public void should_be_nothing_when_no_item(){
		
		// given (arrange)
		Item[] items = new Item[]{};
		GildedRose gildedRose = new GildedRose(items);
		
		// when (act)
		gildedRose.updateQuality();
		
		// then (assert)
		assertEquals(items.length, 0);
	}
	
	@Test
	public void quality_of_noname_is_0_when_quality_is_0(){
		Item[] items = new Item[]{new Item("noname", 0, 0)};
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(items[0].quality, 0);
		assertEquals(items[0].sellIn, -1);
	}
	
	@Test
	public void quality_of_noname_is_0_when_quality_is_1(){
		Item[] items = new Item[]{new Item("noname", 0, 1)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 0);
		assertEquals(items[0].sellIn, -1);
	}

	@Test
	public void quality_of_noname_is_1_when_quality_is_3(){
		Item[] items = new Item[]{new Item("noname", 0, 3)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 1);
		assertEquals(items[0].sellIn, -1);
	}
	
	@Test
	public void quality_of_noname_is_2_when_quality_is_3_and_sellin_1(){
		Item[] items = new Item[]{new Item("noname", 1, 3)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 2);
		assertEquals(items[0].sellIn, 0);
	}
	
	@Test
	public void quality_of_SULFURAS_is_0_when_quality_is_0(){
		Item[] items = new Item[]{new Item(GildedRose.SULFURAS, 0, 0)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 0);
		assertEquals(items[0].sellIn, 0);
	}

	@Test
	public void quality_of_SULFURAS_is_1_when_quality_is_1(){
		Item[] items = new Item[]{new Item(GildedRose.SULFURAS, 0, 1)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 1);
		assertEquals(items[0].sellIn, 0);
	}
	
	@Test
	public void quality_of_SULFURAS_is_1_when_quality_is_1_and_sellin_is_minus_1(){
		Item[] items = new Item[]{new Item(GildedRose.SULFURAS, -1, 1)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 1);
		assertEquals(items[0].sellIn, -1);
	}

	@Test
	public void quality_of_BRIE_is_2_when_quality_is_0(){
		Item[] items = new Item[]{new Item(GildedRose.BRIE, 0, 0)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 2);
		assertEquals(items[0].sellIn, -1);
	}
	
	@Test
	public void quality_of_BRIE_is_1_when_quality_is_0_and_sellin_is_1(){
		Item[] items = new Item[]{new Item(GildedRose.BRIE, 1, 0)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 1);
		assertEquals(items[0].sellIn, 0);
	}
	
	@Test
	public void quality_of_BRIE_is_51_when_quality_is_51(){
		Item[] items = new Item[]{new Item(GildedRose.BRIE, 0, 51)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 51);
		assertEquals(items[0].sellIn, -1);
	}
	
	@Test
	public void quality_of_BRIE_is_51_when_quality_is_49(){
		Item[] items = new Item[]{new Item(GildedRose.BRIE, 0, 49)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 50);
		assertEquals(items[0].sellIn, -1);
	}
	
	@Test
	public void quality_of_BACKSTAGE_is_0_when_quality_is_0(){
		Item[] items = new Item[]{new Item(GildedRose.BACKSTAGE, 0, 0)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 0);
		assertEquals(items[0].sellIn, -1);
	}
	
	
	@Test
	public void quality_of_BACKSTAGE_is_1_when_sellin_is_12(){
		Item[] items = new Item[]{new Item(GildedRose.BACKSTAGE, 12, 0)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 1);
		assertEquals(items[0].sellIn, 11);
	}
	
	
	@Test
	public void quality_of_BACKSTAGE_is_0_when_quality_is_49(){
		Item[] items = new Item[]{new Item(GildedRose.BACKSTAGE, 0, 49)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 0);
		assertEquals(items[0].sellIn, -1);
	}
	
	@Test
	public void quality_of_BACKSTAGE_is_0_when_quality_is_51(){
		Item[] items = new Item[]{new Item(GildedRose.BACKSTAGE, 0, 51)};
		GildedRose gildedRose = new GildedRose(items);
		
		gildedRose.updateQuality();
		
		assertEquals(items[0].quality, 0);
		assertEquals(items[0].sellIn, -1);
	}
	




}
