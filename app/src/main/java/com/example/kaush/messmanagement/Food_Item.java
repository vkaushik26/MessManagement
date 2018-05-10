package com.example.kaush.messmanagement;

/**
 * Created by kaush on 05-04-2018.
 */

public class Food_Item {
    private  String month,foodItem;
    private String quantity;

    public Food_Item(String month,String foodItem,String quantity){
        this.foodItem=foodItem;
        this.quantity=quantity;
        this.month=month;
    }

    public String getMonth() {
        return month;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public String getQuantity() {
        return quantity;
    }
}
