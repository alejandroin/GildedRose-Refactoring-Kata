package com.gildedrose.valueobjects

import com.gildedrose.exceptions.ItemQualityCannotBeLessThanZeroException
import com.gildedrose.exceptions.ItemQualityCannotBeMoreThanMaxException

class ItemQuality(private var quality: Int) {

    private val MAX_QUANTITY = 50;
    private val MIN_QUANTITY = 0;


    fun increase() {
        if (quality.inc() > MAX_QUANTITY)
            throw ItemQualityCannotBeMoreThanMaxException("Item Quality cannot exceed 50.")

        quality.inc()
    }

    fun decrease() {
        if (quality.dec() < MIN_QUANTITY)
            throw ItemQualityCannotBeLessThanZeroException("Item Quality cannot be less than 0.")

        quality.dec()
    }

    fun qualityLowerThanMax() = quality < MAX_QUANTITY

    fun qualityBiggerThanMin() = quality > MIN_QUANTITY
}
