package com.ecpe308.sample;

public class Pet {
    private String name;
    private String breed; // persian, labrador, golden retriever
    private String petType; // cat/dog


    public Pet(String name, String breed, String petType) {
        this.name = name;
        this.breed = breed;
        this.petType = petType;
    }


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getPetType() {
        return petType;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }


}
