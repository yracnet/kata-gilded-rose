package edu.alenasoft.gildedrose.impl;

import edu.alenasoft.gildedrose.BaseItem;
import edu.alenasoft.gildedrose.NextStrategy;
import edu.alenasoft.gildedrose.Observer;

public class DoubleDecrementStrategy implements NextStrategy {

    @Override
    public boolean doNextWork(BaseItem item, Observer change) {
        if (item.getSellIn() == 0) {
            item.setQuality(item.getQuality() - 2);
            change.onChange(item);
            return false;
        }
        return true;
    }

}
