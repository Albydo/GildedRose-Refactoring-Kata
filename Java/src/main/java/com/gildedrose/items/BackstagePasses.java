package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstagePasses extends ItemWrapper {

    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    protected void changeQualityAdd(){
        if(item.sellIn > 10){
            qualityAdd = 1;
        }
        else if(item.sellIn > 5){
            qualityAdd = 2;
        }
        else {
            qualityAdd = 3;
        }
    }

    @Override
    protected void changeQuality(){
        if(item.sellIn > 0)
            super.changeQuality();
        else
            item.quality = 0;
    }
}
