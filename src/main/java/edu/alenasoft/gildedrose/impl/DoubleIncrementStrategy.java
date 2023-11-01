package edu.alenasoft.gildedrose.impl;

import edu.alenasoft.gildedrose.BaseItem;
import edu.alenasoft.gildedrose.NextStrategy;
import edu.alenasoft.gildedrose.Observer;

public class DoubleIncrementStrategy implements NextStrategy {

    @Override
    public boolean doNextWork(BaseItem item, Observer change) {
        String name = item.getName();
        if (name.contains("Aged Brie") || name.contains("Backstage passes")) {
            int sellIn = item.getSellIn();
            int quality = item.getQuality();
            if (sellIn == 0) {
                item.setQuality(0);
            } else if (sellIn <= 5) {
                item.setQuality(3 + quality);
            } else if (sellIn > 10) {
                item.setQuality(2 + quality);
            }
            change.onChange(item);
        }
        return true;
    }

}
