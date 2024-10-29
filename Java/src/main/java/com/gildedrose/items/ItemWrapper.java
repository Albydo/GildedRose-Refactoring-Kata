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

    public ItemWrapper(Item item){
        this(item, 50);
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
        //Alle quality attributen zullen nu liggen tussen 0 de MAXQUALITY van het item
        item.quality = Math.min(Math.max(item.quality + qualityAdd, 0), MAXQUALITY);
    }

    public void updateQuality(){
        changeQualityAdd();
        changeQuality();
        item.sellIn--;
    }



}
