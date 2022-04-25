package com.fitness.calculator.model;

public enum ActivityLevel {
    SEDENTARY(1.2),
    LOW_ACTIVITY(1.375),
    MEDIUM_ACTIVITY(1.55),
    HIGH_ACTIVITY(1.725);

    // 1,2 = sedentar (exerciții minime sau deloc)
    //1,375 = activitate ușoară (1 – 3 zile în timpul săptămânii exerciții ușoare sau sport)
    //1,55 = activitate medie (3 – 5 zile în timpul săptămânii exerciții medii sau sport)
    //1,725 = activitate ridicată (6 – 7 zile în timpul săptămânii exerciții dificile sau sport)

    public final double index;

    ActivityLevel(double index) {
        this.index = index;
    }

    public double getIndex() {
        return index;
    }
}
