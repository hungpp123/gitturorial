package com.learn.review.abstracfactory;

public class FurnitureFactory {
    public static AbstractFurnitureFactory getFurnitureFactory(MaterialType materialType) {
        switch (materialType){
            case WOOD:
                return new WoodFactory();
            case PLASTIC:
                return new PlasticFactory();
            default:
                throw new IllegalArgumentException("This material type doesn't support");
        }
    }
}
