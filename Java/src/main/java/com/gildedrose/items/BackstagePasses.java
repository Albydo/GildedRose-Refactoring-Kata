package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstagePasses extends ItemWrapper {

    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if(item.sellIn <= 10 && item.sellIn > 5){
            item.quality = item.quality + 2;
        } else if (item.sellIn <= 5 && item.sellIn > 0) {
            item.quality = item.quality + 3;
        }else{
            item.quality = 0;
        }

    }
}
