package com.learn.test02;
/**
 * 编程实现手机卡的类型枚举类
 */
public enum CardType {
    BIG("大卡"),SMALL("小卡"),MICRO("微型卡");
    private final String type;

    private CardType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
