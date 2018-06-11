package com.lotus.development.LearnSpringBootEasy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jbalakr on 6/11/18.
 */
public class Item {
    public Item(List<ImageDTO> images, String productId, String itemName, int itemId) {
        this.images = images;
        this.productId = productId;
        this.itemName = itemName;
        this.itemId = itemId;
    }

    public Item(String productId, String itemName, int itemId) {
        this.productId = productId;
        this.itemName = itemName;
        this.itemId = itemId;

    }

    private String productId;

    private String itemName;

    private int itemId;

    private List<ImageDTO> images;

    public List<ImageDTO> getImages() {

        if(this.images == null) {
            this.images = new ArrayList();
        }

        return this.images;
    }

    public String getProductId() {
        return productId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemId() {
        return itemId;
    }

    @Override
    public String toString() {
        return "Item{" +
                "productId='" + productId + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemId=" + itemId +
                '}';
    }
}
