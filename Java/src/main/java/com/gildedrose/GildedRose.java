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
            ItemWrapper itemWrapper = switch (item.name){
                case "Aged Brie" -> new AgedBrie(item);
                case "Backstage passes to a TAFKAL80ETC concert" -> new BackstagePasses(item);
                case "Sulfuras, Hand of Ragnaros" -> new Sulfuras(item);
                default -> new DefaultItem(item);
            };
            returnItemWrappers.add(itemWrapper);
        });
        return returnItemWrappers;
    }

    public void updateQuality() {
        itemWrappers.forEach(ItemWrapper::updateQuality);
    }
}
