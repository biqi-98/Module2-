package com.learn.test02;

/**
 * 抽象套餐类
 */
public abstract class Duration {
    protected static Double monthlyFee;

    public static Double getMonthlyFee() {
        return monthlyFee;
    }

    public static void setMonthlyFee(Double monthlyFee) {
        Duration.monthlyFee = monthlyFee;
    }

    public void show(){
        System.out.println("抽象套餐类每月资费"+Duration.monthlyFee);
    }
}
