package com.gildedrose.items;

import com.gildedrose.Item;

public class AgedBrie extends ItemWrapper{

    public AgedBrie(Item item){
        super(item);
    }

    @Override
    protected void changeQualityAdd(){
        //Zelfde logica als een normaal item, maar optellen ipv aftrekken
        super.changeQualityAdd();
        qualityAdd = qualityAdd * -1;
    }

}
