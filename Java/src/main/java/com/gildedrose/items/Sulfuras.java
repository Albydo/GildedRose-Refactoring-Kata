package com.gildedrose.items;

import com.gildedrose.Item;

public class Sulfuras extends ItemWrapper {

    public Sulfuras(Item item) {
        super(item, 80);
    }

    //Dit item blijft hetzelfde
    @Override
    public void updateQuality() {

    }
}
