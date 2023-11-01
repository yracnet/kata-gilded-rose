package edu.alenasoft.gildedrose.impl;

import edu.alenasoft.gildedrose.BaseItem;
import edu.alenasoft.gildedrose.NextStrategy;
import edu.alenasoft.gildedrose.Observer;

public class LegendarioStrategy implements NextStrategy {

    @Override
    public boolean doNextWork(BaseItem item, Observer change) {
        String name =item.getName();
        if(name.contains("Sulfuras")){
            return false;
        }
        return true;
    }

}
