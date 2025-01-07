package org.example.week13.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CamelCaseFormatter implements TextFormatter {
    @Override
    public String formatText(String text) {
        String finalString = "";
        List<String> words = new ArrayList<>(Arrays.asList(text.split(" ")));
        for (int i=0; i< words.size(); i++) {
            if (i==0) {
                finalString += words.get(i);
            } else {
                String cap = words.get(i).substring(0, 1).toUpperCase() + words.get(i).substring(1);
                finalString += cap;
            }
        }
        return finalString;
    }

//    public static void main(String[] args) {
//        CamelCaseFormatter ccf = new CamelCaseFormatter();
//        System.out.println(ccf.formatText("ja sam ja"));
//
//    }
}
