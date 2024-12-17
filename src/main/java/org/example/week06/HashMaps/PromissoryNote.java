package org.example.week6.HashMaps;

import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> promissory = new HashMap<>();

    public PromissoryNote() {

    }

    public void setLoan(String toWhom, double value) {
        promissory.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (promissory.containsKey(whose)) {
            return promissory.get(whose);
        }
        return 0;
    }

    public static void main(String[] args) {

//        PromissoryNote mattisNote = new PromissoryNote();
//        mattisNote.setLoan("Arto", 51.5);
//        mattisNote.setLoan("Mikael", 30);
//        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
//        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));

        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Arto", 10.5);
        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
    }
}
