package com.example.myapplication;

import java.io.Serializable;

public class Food implements Serializable {
    private String foodname;
    private int foodprice;
    private int foodImage;

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public int getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(int foodprice) {
        this.foodprice = foodprice;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(int foodImage) {
        this.foodImage = foodImage;
    }

    public Food(String foodname, int foodprice, int foodImage) {
        this.foodname = foodname;
        this.foodprice = foodprice;
        this.foodImage = foodImage;
    }

}