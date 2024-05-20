package org.lessons.java.Shop;

import java.math.BigDecimal;
import java.util.Random;

class Smartphone extends Product{

    private int imei;
    private int storage;
    // private int[] storageOptions = {32, 64, 128, 256, 512, 1024};

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, int storage){
        super(name, description, price, vat);
        // this.imei = imei;
        // this.storage = storage;
        this.imei = getRandomImei();
        // this.storage = getMaxStorage();
        this.storage = storage;
    }

    int getRandomImei(){
        return new Random().nextInt(100000, 1000000);
    }

    // int getMaxStorage(){
    //     return storageOptions[new Random().nextInt(0, storageOptions.length)];
    // }

    @Override
    public String toString() {
        return "Smartphone {" +
                "code: '" + getCode() +
                ", name: '" + getName() +
                ", description: '" + getDesc() +
                ", price: " + getPrice() + "$" +
                ", taxed price: " + getTaxedPrice(getPrice()) + "$" +
                ", storage: " + storage + " GB" +
                '}';
    }
}
