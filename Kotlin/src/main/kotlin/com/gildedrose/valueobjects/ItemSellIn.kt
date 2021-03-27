package com.gildedrose.valueobjects

class ItemSellIn(private val sellIn: Int) {


    fun increase() {
        sellIn.inc()
    }

    fun decrease() {
        sellIn.dec()
    }


}
