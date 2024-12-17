package org.example.week6.HashMaps;
import java.util.*;

public class Dictionary {

    private HashMap<String, String> dictionary = new HashMap<>();

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        return "Word \"" + word + "\" is not in dictionary";
    }

    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    public int amountOfWords() {
        System.out.println(dictionary);
        return dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<>();
        for (Map.Entry<String, String> e : dictionary.entrySet()) {
            translationList.add(e.getKey() + " = " + e.getValue());
        }
        return translationList;
    }

    public static void main(String[] args) {
//        Dictionary dictionary = new Dictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("cembalo", "harpsichord");
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("porkkana"));

//        Dictionary dictionary = new Dictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        System.out.println(dictionary.amountOfWords());
//        dictionary.add("cembalo", "harpsichord");
//        System.out.println(dictionary.amountOfWords());

        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");
        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }

    }
}
