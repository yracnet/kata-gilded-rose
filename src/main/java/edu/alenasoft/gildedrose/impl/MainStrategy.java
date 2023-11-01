package edu.alenasoft.gildedrose.impl;

import edu.alenasoft.gildedrose.BaseItem;
import edu.alenasoft.gildedrose.NextStrategy;
import edu.alenasoft.gildedrose.Observer;
import edu.alenasoft.gildedrose.Strategy;
import java.util.List;

public class MainStrategy implements Strategy {

    private static List<NextStrategy> strategies = List.of(
            new LegendarioStrategy(),
            new DoubleDecrementStrategy(),
            new SimpleIncrementStrategy(),
            new DoubleIncrementStrategy(),
            new SimpleDecrementStrategy()
    );

    @Override
    public void doWork(BaseItem item) {
        boolean next = true;
        System.out.println(":" + item.getName());
        Observer change  =  new LimiteObserver();
        for (int i = 0; next && i < strategies.size(); i++) {
            NextStrategy nextStrategy = strategies.get(i);
            next = nextStrategy.doNextWork(item, change);
            System.out.println(">>>>" + nextStrategy + " : " + next);
        }
    }

}
