package com.fitness.calculator.model;

public class User {
    private Double height;
    private Double weight;
    private String gender;
    private Integer age;
    private ActivityLevel activityLevel;
//    private WeightModifierTypes weightModifier;

    public User() {
    }

    public User(Double height, Double weight, String gender, Integer age, ActivityLevel activityLevel, WeightModifierTypes weightModifier) {
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
        this.activityLevel = activityLevel;
//        this.weightModifier = weightModifier;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(ActivityLevel activityLevel) {
        this.activityLevel = activityLevel;
    }

//    public WeightModifierTypes getWeightModifier() {
//        return weightModifier;
//    }
//
//    public void setWeightModifier(WeightModifierTypes weightModifier) {
//        this.weightModifier = weightModifier;
//    }

    @Override
    public String toString() {
        return "User{" +
                "height=" + height +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", activityLevel=" + activityLevel +
                '}';
    }
}
