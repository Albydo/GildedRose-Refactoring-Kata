package com.gildedrose.items;

import com.gildedrose.Item;

public class Conjured extends ItemWrapper{

    public Conjured(Item item) {
        super(item);
    }

    //Kwaliteit daalt 2 keer zo snel
    @Override
    protected void changeQualityAdd() {
        super.changeQualityAdd();
        qualityAdd = qualityAdd * 2;
    }
}
