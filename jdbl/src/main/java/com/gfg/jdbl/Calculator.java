package com.gfg.jdbl;

public class Calculator {
    private Multiplier multiplier;
    public Calculator(Multiplier multiplier)
    {
        this.multiplier=multiplier;
    }
    Float mul(Float a,Float b)
    {
        return multiplier.multiply(a,b);
    }
}
