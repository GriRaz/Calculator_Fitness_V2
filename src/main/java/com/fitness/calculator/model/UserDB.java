//package com.fitness.calculator.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "users")
//public class UserDB {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private Integer height;
//
//    private Double weight;
//
//    private String gender;
//
//    private Integer age;
//
//    @Enumerated
//    private ActivityLevel activityLevel;
//
//    @Enumerated
//    private WeightModifierTypes weightModifier;
//
//    public UserDB() {
//    }
//
//    public UserDB(Integer height, Double weight, String gender, Integer age, ActivityLevel activityLevel, WeightModifierTypes weightModifier) {
//        this.height = height;
//        this.weight = weight;
//        this.gender = gender;
//        this.age = age;
//        this.activityLevel = activityLevel;
//        this.weightModifier = weightModifier;
//    }
//
//    public Integer getHeight() {
//        return height;
//    }
//
//    public void setHeight(Integer height) {
//        this.height = height;
//    }
//
//    public Double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(Double weight) {
//        this.weight = weight;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public ActivityLevel getActivityLevel() {
//        return activityLevel;
//    }
//
//    public void setActivityLevel(ActivityLevel activityLevel) {
//        this.activityLevel = activityLevel;
//    }
//
//    public WeightModifierTypes getWeightModifier() {
//        return weightModifier;
//    }
//
//    public void setWeightModifier(WeightModifierTypes weightModifier) {
//        this.weightModifier = weightModifier;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "height=" + height +
//                ", weight=" + weight +
//                ", gender='" + gender + '\'' +
//                ", age=" + age +
//                ", activityLevel=" + activityLevel +
//                ", weightModifier=" + weightModifier +
//                '}';
//    }
//}
