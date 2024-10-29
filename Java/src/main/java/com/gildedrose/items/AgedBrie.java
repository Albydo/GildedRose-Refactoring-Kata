package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends ItemWrapper{

    public AgedBrie(Item item){
        super(item);
    }

    @Override
    public void updateQuality(){
        if(item.sellIn > 0){
            item.quality = Math.min(item.quality + 1, 50);
        }
        item.sellIn--;
    }

}
