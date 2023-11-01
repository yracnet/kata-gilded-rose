package edu.alenasoft.gildedrose;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Item implements BaseItem {

    public String name;
    public int sellIn;
    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }
}
