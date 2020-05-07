package com.learn.test02;

/**
 * 通话服务接口
 */
public interface Call {
    //抽象方法: 参数 1: 通话分钟, 参数 2: 手机卡类对象
    public abstract void test(int duration,CardType cardType);
}
