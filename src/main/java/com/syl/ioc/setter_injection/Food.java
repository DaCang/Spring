package com.syl.ioc.setter_injection;

public class Food {

    int foodId;
    String foodName;

    public Food() {
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void eaten(){

        System.out.println(foodName+" 被吃了");
    }
}
