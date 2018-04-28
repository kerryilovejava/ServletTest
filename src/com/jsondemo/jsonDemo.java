package com.jsondemo;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: 5385
 * @Date 2018/4/27
 * @Time 17:46
 */
public class jsonDemo {
    public static void main(String[] args) {
        Data data = new Data();
        data.setAge("18");
        data.setName("zhujinfan");
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        data.setKv(map);
        Gson gson = new Gson();
        String json = gson.toJson(data);
        System.out.println(json);

    }
}
