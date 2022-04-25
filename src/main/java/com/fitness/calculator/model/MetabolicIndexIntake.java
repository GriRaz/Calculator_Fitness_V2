package com.fitness.calculator.model;

public class MetabolicIndexIntake {
    private final Double metabolicIndex;
    private final Double metabolicRate;

    public MetabolicIndexIntake(Double metabolicIndex, Double metabolicRate) {
        this.metabolicIndex = metabolicIndex;
        this.metabolicRate = metabolicRate;
    }

    public Double getMetabolicIndex() {
        return metabolicIndex;
    }

    public Double getMetabolicRate() {
        return metabolicRate;
    }
}
