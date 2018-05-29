package com.writeSql;


public class WriteSql {
    public static void main(String[] args) {
        int[] arr = {100, 130, 160, 170, 240, 300, 310, 321, 350, 351, 400, 405, 420, 470};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("INSERT into fc_role_menu (id,menuId,roleId) VALUES(replace(UUID(),'-','')," + arr[i] + ",'tianmao');");
        }
    }
}
