package com.gildedrose.valueobjects

class ItemSellIn(private val sellIn: Int) {


    fun increase() {
        sellIn.inc()
    }

    fun decrease() {
        sellIn.dec()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ItemSellIn

        if (sellIn != other.sellIn) return false

        return true
    }

}
