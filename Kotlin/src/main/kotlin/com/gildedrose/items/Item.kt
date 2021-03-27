package com.gildedrose.items

import com.gildedrose.valueobjects.ItemName
import com.gildedrose.valueobjects.ItemQuality
import com.gildedrose.valueobjects.ItemSellIn

abstract class Item(var name: ItemName, var sellIn: ItemSellIn, var quality: ItemQuality) {


    fun increaseQuality() {
        quality.increase()
    }

    fun decreaseQuality() {
        quality.decrease()
    }

    fun checkIfQualityIsLowerThanMax() = quality.qualityLowerThanMax()
    fun checkIfQualityIsBiggerThanMin() = quality.qualityBiggerThanMin()


    fun increaseSellIn() {
        sellIn.increase()
    }

    fun decreaseSellIn() {
        sellIn.decrease()
    }


}