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
            else
                returnItemWrappers.add(new DefaultItem(item));
            /*ItemWrapper itemWrapper = switch (item.name){
                case "Aged Brie" -> new AgedBrie(item);
                case "Backstage passes to a TAFKAL80ETC concert" -> new BackstagePasses(item);
                case "Sulfuras, Hand of Ragnaros" -> new Sulfuras(item);
                //Conjured items verliezen quality dubbel zo snel, maar in test gebeurt dit nog aan het normaal tempo
                //Uncomment volgende lijn voor Conjured items dubbel zo snel quality le laten verliezen
                //case "Conjured Mana Cake" -> new Conjured(item);
                default -> new DefaultItem(item);
            };
            returnItemWrappers.add(itemWrapper);*/
        });
        return returnItemWrappers;
    }

    public void updateQuality() {
        itemWrappers.forEach(ItemWrapper::updateQuality);
    }
}
