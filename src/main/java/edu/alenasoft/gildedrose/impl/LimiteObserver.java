package edu.alenasoft.gildedrose.impl;

import edu.alenasoft.gildedrose.BaseItem;
import edu.alenasoft.gildedrose.Observer;
import edu.alenasoft.gildedrose.Strategy;

public class LimiteObserver implements Observer {

    @Override
    public void onChange(BaseItem item) {
        if(item.getQuality() < 0){
            item.setQuality(0);
        }
        if(50 < item.getQuality() ){
            item.setQuality(50);
        }
    }

}
