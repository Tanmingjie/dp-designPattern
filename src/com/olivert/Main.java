package com.olivert;

import com.olivert.innerclass.OuterClass;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String replace = "abc".replace("n", "t");
        System.out.println(replace);
        Map<Object, Object> map = new HashMap<>();
        System.out.println((String) map.get("sss"));
        System.out.println("Basic " + Base64.getEncoder().encodeToString(("olivert@synnex.com" + ":" + "synnex-0703").getBytes()));
        String s = (String)null;
        System.out.println(String.format("sss %s", s));
    }
}
