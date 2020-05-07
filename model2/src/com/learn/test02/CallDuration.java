package com.learn.test02;
/**
 * 编程实现通话套餐类
 */
public class CallDuration extends Duration implements Call{

    //通话时长(分钟)
    private int duration;
    //短信条数
    private Double messageNums;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Double getMessageNums() {
        return messageNums;
    }

    public void setMessageNums(Double messageNums) {
        this.messageNums = messageNums;
    }
//每月资费
//    private Double monthlyFee;

    //显示所有套餐信息
    public void show(){
//        System.out.println("通话时长:"+duration+",短信条数:"+messageNums+",每月资费"+monthlyFee);
        System.out.println("通话时长:"+duration+",短信条数:"+messageNums+",每月资费"+Duration.monthlyFee);
        System.out.println("上面是通话套餐类里的show");
    }

    //通话套餐类实现通话服务接口
    @Override
    public void test(int duration, CardType cardType) {
        System.out.println("这是通话服务里的抽象方法");
    }
}
