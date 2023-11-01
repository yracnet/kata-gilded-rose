package edu.alenasoft.gildedrose;

public interface NextStrategy {

    boolean doNextWork(BaseItem item, Observer change);
}
