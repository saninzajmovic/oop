package org.example.week6.HashMaps;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, String> names = new HashMap<>();
        names.put("matti", "mage");
        names.put("mikael", "mixu");
        names.put("arto", "arppa");
        System.out.println(names.get("mikael"));
    }
}
