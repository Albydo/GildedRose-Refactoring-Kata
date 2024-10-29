package com.gildedrose.items;

import com.gildedrose.Item;

public abstract class ItemWrapper {

    protected Item item;
    protected final int MAXQUALITY;
    protected int qualityAdd;

    public ItemWrapper(Item item, int MAXQUALITY){
        this.item = item;
        this.MAXQUALITY = MAXQUALITY;
        changeQualityAdd();
    }

    protected void changeQualityAdd(){
        if(item.sellIn > 0){
            qualityAdd = -1;
        }
        else {
            qualityAdd = -2;
        }
    }

    protected void changeQuality(){
        item.quality = Math.min(Math.max(item.quality + qualityAdd, 0), MAXQUALITY);
    }

    public void updateQuality(){
        changeQualityAdd();
        changeQuality();
        item.sellIn--;
    }



}
