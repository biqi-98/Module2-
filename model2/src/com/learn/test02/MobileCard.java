package com.learn.test02;

/**
 * 编程实现手机卡类
 */
public class MobileCard {
    //卡类型
    private String type;
    //卡号
    private String number;
    //用户名
    private String userName;
    //密码
    private String passWord;
    //账户余额
    private Double balance;
    //通话时长(分钟)
    private int duration;
    //上网流量
    private Double traffic;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

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

    //显示（卡号 + 用户名 + 当前余额）
    public void show(){
        System.out.println("卡号:"+number+",用户名:"+userName+",当前余额"+balance);
        System.out.println("手机卡类的show");
    }

}
