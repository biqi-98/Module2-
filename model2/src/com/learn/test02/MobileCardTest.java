package com.learn.test02;

public class MobileCardTest {
    public static void show(Duration d1){
//        System.out.println("上网流量:"+traffic+",每月资费"+monthlyFee);
        d1.show();
    }

    public static void main(String[] args) {

        CardType t1=CardType.BIG;
        CardType t2=CardType.SMALL;
        CardType t3=CardType.MICRO;
        System.out.println(t1);
        CallDuration callDuration=new CallDuration();
        callDuration.show();
        System.out.println("--------------------------------------");
        callDuration.test(1,t2);
        System.out.println("--------------------------------------");
        MobileCard mobileCard=new MobileCard();
        mobileCard.show();
        System.out.println("--------------------------------------");
        TrafficDuration trafficDuration=new TrafficDuration();
        trafficDuration.show();
        System.out.println("--------------------------------------");
        trafficDuration.test(1.0,t3);
        System.out.println("--------------------------------------");
        MobileCardTest.show(new CallDuration());
        System.out.println("--------------------------------------");
        MobileCardTest.show(new TrafficDuration());

    }
}
