package com.jsondemo;

import java.io.Serializable;
import java.util.Map;

/**
 * @Description:
 * @Author: 5385
 * @Date 2018/4/27
 * @Time 17:46
 */
public class Data implements Serializable {
    private String name;
    private String age;
    private Map<String, String> kv;

    public Data(String name, String age, Map<String, String> kv) {
        this.name = name;
        this.age = age;
        this.kv = kv;
    }

    public Data() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Map<String, String> getKv() {
        return kv;
    }

    public void setKv(Map<String, String> kv) {
        this.kv = kv;
    }
}
