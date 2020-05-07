package com.learn.test02;
/**
 * 编程实现用户消费信息类
 */

public class Consume {

    //通话时长
    private int duration;

    //上网流量
    private Double traffic;

    //月费
    private Double monthlyFee;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Double getTraffic() {
        return traffic;
    }

    public void setTraffic(Double traffic) {
        this.traffic = traffic;
    }

    public Double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(Double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
}
