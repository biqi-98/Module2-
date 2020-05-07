package com.learn.test02;

/**
 * 编程实现上网套餐类
 */
public class TrafficDuration extends Duration implements Traffic{

    //上网流量
    private Double traffic;

    public Double getTraffic() {
        return traffic;
    }

    public void setTraffic(Double traffic) {
        this.traffic = traffic;
    }
    //每月资费
//    private Double monthlyFee;

    //显示所有套餐信息
    public void show(){
//        System.out.println("上网流量:"+traffic+",每月资费"+monthlyFee);
        System.out.println("上网流量:"+traffic+",每月资费"+Duration.monthlyFee);
        System.out.println("上面是上网套餐类里的show");

    }

    // 上网套餐类实现上网服务接口
    @Override
    public void test(Double traffic, CardType cardType) {
        System.out.println("这是上网服务里的抽象方法");
    }

}
