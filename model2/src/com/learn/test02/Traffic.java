package com.learn.test02;
/**
 * 上网服务接口
 */
public interface Traffic {
    //抽象方法: 参数 1: 上网流量, 参数 2: 手机卡类对象
    public abstract void test(Double traffic,CardType cardType);


}
