package edu.alenasoft.gildedrose.impl;

import edu.alenasoft.gildedrose.BaseItem;
import edu.alenasoft.gildedrose.NextStrategy;
import edu.alenasoft.gildedrose.Observer;
import edu.alenasoft.gildedrose.Strategy;

public class SimpleDecrementStrategy implements NextStrategy {

    @Override
    public boolean doNextWork(BaseItem item, Observer change) {
        item.setQuality(item.getQuality() - 1);
        change.onChange(item);
        return true;
    }

}
