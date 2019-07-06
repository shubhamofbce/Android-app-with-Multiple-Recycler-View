package com.example.foodentertainmenet;

public class FoodItems {
    String DishName,FoodDesc,Price;
    int Dishimg;

    public FoodItems(String dishName, String foodDesc, String price, int dishimg) {
        DishName = dishName;
        FoodDesc = foodDesc;
        Price = price;
        Dishimg = dishimg;
    }

    public String getDishName() {
        return DishName;
    }

    public String getFoodDesc() {
        return FoodDesc;
    }

    public String getPrice() {
        return Price;
    }

    public int getDishimg() {
        return Dishimg;
    }
}
