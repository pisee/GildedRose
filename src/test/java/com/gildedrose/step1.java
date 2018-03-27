package com.gildedrose;

class GildedRose {
	private static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
	private static final String BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
	private static final String AGED_BRIE = "Aged Brie";
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			Item item = items[i];
			if (item.name.equals(AGED_BRIE)) {
				AgedBrie agedBrie = new AgedBrie(item);
				agedBrie.updateQuality();
			} else if (item.name.equals(BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT)) {
				updateQualityForBackstagePassItem(item);
			} else if (item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
				updateQualityForSulfurasItem(item);
			} else {
				updateQualityForNormalItem(item);
			}

			if (item.name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
			} else {
				item.sellIn = item.sellIn - 1;
			}
		}
	}

	private void updateQualityForNormalItem(Item item) {
		if (item.quality > 0) {
			item.quality = item.quality - 1;
		}
		if (item.sellIn < 1) {
			if (item.quality > 0) {
				item.quality = item.quality - 1;
			}
		}
	}

	private void updateQualityForSulfurasItem(Item item) {
		if (item.quality > 0) {

		}
		if (item.sellIn < 0) {
			if (item.quality > 0) {

			}
		}
	}

	private void updateQualityForBackstagePassItem(Item item) {
		if (item.quality < 50) {
			item.quality = item.quality + 1;

			if (item.sellIn < 11) {
				if (item.quality < 50) {
					item.quality = item.quality + 1;
				}
			}

			if (item.sellIn < 6) {
				if (item.quality < 50) {
					item.quality = item.quality + 1;
				}
			}
		}
		if (item.sellIn < 1) {
			item.quality = item.quality - item.quality;
		}
	}
}
