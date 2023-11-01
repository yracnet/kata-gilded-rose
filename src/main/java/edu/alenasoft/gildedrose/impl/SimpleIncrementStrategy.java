package edu.alenasoft.gildedrose.impl;

import edu.alenasoft.gildedrose.BaseItem;
import edu.alenasoft.gildedrose.NextStrategy;
import edu.alenasoft.gildedrose.Observer;
import edu.alenasoft.gildedrose.Strategy;

public class SimpleIncrementStrategy implements NextStrategy {

    @Override
    public boolean doNextWork(BaseItem item, Observer change) {
        if (item.getName().contains("Aged Brie")) {
            item.setQuality(item.getQuality() + 1);
            change.onChange(item);
            return false;
        }
        return true;
    }

}
