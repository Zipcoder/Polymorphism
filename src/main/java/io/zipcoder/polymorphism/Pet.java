package io.zipcoder.polymorphism;

public abstract class Pet {
    static String name;
    static String type;

    public String  speak(){
        return "";
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Pet.name = name;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Pet.type = type;
    }



}
