package com.enumdemo;

/**
 * @Description:
 * @Author: 5385
 * @Date 2018/8/17
 * @Time 10:38
 */
public enum Enum2 {
    SUCCESS(0, "成功"),

    FAILE(1, "失败");

    int resultCode;
    String resultMsg;

    Enum2(int resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public static void main(String[] args) {
        System.out.println(Enum2.SUCCESS.resultCode);
        System.out.println(Enum2.SUCCESS.resultMsg);
        System.out.println(Enum2.SUCCESS.getResultCode());
        System.out.println(Enum2.SUCCESS.getResultMsg());
    }
}
