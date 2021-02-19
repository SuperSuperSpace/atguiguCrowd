package com.atguigu.crowd.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LomBokTest {

    private Integer id;
    private String name;
    private Double price;

    public static void main(String[] args) {
        LomBokTest clz1 = new LomBokTest();
        LomBokTest clz2 = new LomBokTest(1, "hello", 55.5);

        clz1.setName("world");

        System.out.println(clz1);
        System.out.println(clz2);
    }

}
