package com.example.kaush.messmanagement;

public class Additem {
    private String mVegetableName;
    private int mVegetableQuantity;

    public Additem() {

    }

    public Additem(String vegetableName, int vegetableQuantity) {
        mVegetableName = vegetableName;
        mVegetableQuantity = vegetableQuantity;
    }

    private void setVegetableName(String vegetable) {
        mVegetableName = vegetable;
    }

    private void setVegetableQuantity(int quantity) {
        mVegetableQuantity = quantity;
    }

    public String getVegetableName() {
        return mVegetableName;
    }

    public int getVegetableQuantity() {
        return mVegetableQuantity;
    }
}

