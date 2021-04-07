package com.gildedrose

import com.gildedrose.items.AgedBrie
import com.gildedrose.items.Item
import com.gildedrose.valueobjects.ItemName
import com.gildedrose.valueobjects.ItemQuality
import com.gildedrose.valueobjects.ItemSellIn
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GildedRoseTest {

    @Test
    fun foo() {
        val items = arrayOf<Item>(AgedBrie(ItemName("AgedBrie"), ItemSellIn(25), ItemQuality(25)))
        val app = GildedRose(items)
        app.updateQuality()
        val expectedItemQuality = ItemQuality(26)
        assertEquals(expectedItemQuality, app.items[0].quality)
    }

}


