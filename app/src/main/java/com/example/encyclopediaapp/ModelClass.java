package com.example.encyclopediaapp;

public class ModelClass {

    //what data will we show to the user?
    //Name of category and picture to that category

    private String imageName;  //it will have address where image is located
    private String categoryName;

    //Create constructor


    public ModelClass(String imageName, String categoryName) {
        this.imageName = imageName;
        this.categoryName = categoryName;
    }

    public String getImageName() {
        return imageName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
