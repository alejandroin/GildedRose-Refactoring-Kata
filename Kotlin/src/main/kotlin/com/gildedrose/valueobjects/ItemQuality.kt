package com.gildedrose.valueobjects

class ItemQuality(private var quality: Int) {

    private val MAX_QUANTITY = 50;
    private val MIN_QUANTITY = 0;


    fun increase() {
        quality++

        if (quality + 1 > MAX_QUANTITY)
            this.quality = MAX_QUANTITY

    }

    fun decrease() {
        quality--

        if (quality.dec() < MIN_QUANTITY)
            this.quality = MIN_QUANTITY

    }

    fun qualityLowerThanMax() = quality < MAX_QUANTITY

    fun qualityBiggerThanMin() = quality > MIN_QUANTITY
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ItemQuality

        if (quality != other.quality) return false
        if (MAX_QUANTITY != other.MAX_QUANTITY) return false
        if (MIN_QUANTITY != other.MIN_QUANTITY) return false

        return true
    }


}
