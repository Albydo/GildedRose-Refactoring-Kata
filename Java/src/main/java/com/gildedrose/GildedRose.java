package com.gildedrose;

import com.gildedrose.items.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GildedRose {
    Item[] items;
    List<ItemWrapper> itemWrappers;

    public GildedRose(Item[] items) {
        this.items = items;
        itemWrappers = createItemWrapperList();
    }

    private List<ItemWrapper> createItemWrapperList(){
        List<ItemWrapper> returnItemWrappers = new ArrayList<>();
        Arrays.stream(items).forEach(item -> {
            if(item.name.contains("Aged Brie"))
                returnItemWrappers.add(new AgedBrie(item));
            else if(item.name.contains("Backstage passes"))
                returnItemWrappers.add(new BackstagePasses(item));
            else if(item.name.contains("Sulfuras"))
                returnItemWrappers.add(new Sulfuras(item));
            else if (item.name.contains("Conjured"))
                returnItemWrappers.add(new Conjured(item));
            else
                returnItemWrappers.add(new DefaultItem(item));

        });
        return returnItemWrappers;
    }

    public void updateQuality() {
        itemWrappers.forEach(ItemWrapper::updateQuality);
    }
}
