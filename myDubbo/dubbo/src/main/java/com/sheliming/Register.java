package com.sheliming;

import com.sheliming.framework.Producter;
import com.sheliming.framework.URL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Register {
    public static Map<String,List<Producter>> REGISTER = new HashMap<String,List<Producter>>();

    public static void register(String serviceName, URL url,Class implClass) {
        List<Producter> producterList = REGISTER.get(serviceName);
        if(producterList == null) {
            producterList = new ArrayList<>();
        }

        Producter producter = new Producter(url,implClass);
        producterList.add(producter);

        REGISTER.put(serviceName,producterList);

    }

    public static List<Producter> get(String serviceName) {
        return REGISTER.get(serviceName);
    }
}
