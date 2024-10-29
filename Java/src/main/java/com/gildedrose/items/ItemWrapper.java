package com.gildedrose.items;

import com.gildedrose.Item;

public abstract class ItemWrapper {

    protected Item item;

    public ItemWrapper(Item item){
        this.item = item;
    }

    public void updateQuality(){
        if(item.sellIn <= 0){
            item.quality = Math.max(item.quality - 2,0);
        }else{
            item.quality = Math.max(item.quality - 1,0);
        }
        item.sellIn--;
    }

}
