package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends ItemWrapper{

    public AgedBrie(Item item){
        super(item, 50);
        changeQualityAdd();
    }

    @Override
    protected void changeQualityAdd(){
        if(item.sellIn > 0){
            qualityAdd = 1;
        }
        else {
            qualityAdd = 2;
        }
    }

}
