package com.liuyaorong.pattern.FactoryMethod.base;

/**
 * Created by liuyaorong on 2023/6/9
 */
public abstract class Operation {

    private double a = 0;
    private double b = 0;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public abstract double getResult();
}