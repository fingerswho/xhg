package com.xhg;

import java.util.Properties;
import java.util.Set;

public class PropertiseDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("路飞", "18");
        prop.setProperty("索隆", "19");
        prop.setProperty("山治", "21");
        System.out.println(prop);


        Set<Object> objects = prop.keySet();
        System.out.println(objects);
    }
}
