package streams.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class DictionaryExample {

    private TreeMap<String, List<String>> wordMap = new TreeMap<>();

    // Method to add a new meaning to a word
    public void addMeaning(String word, String meaning) {
        wordMap.computeIfAbsent(word, k -> new ArrayList<>()).add(meaning);
    }

    // Method to get the meanings of a word
    public List<String> getMeanings(String word) {
        return wordMap.get(word);
    }

    // Method to display the dictionary
    public void displayDictionary() {
        wordMap.forEach((word, meanings) -> {
            System.out.println(word + " : " + meanings);
        });
    }

    public static void main(String[] args) {
        DictionaryExample dictionary = new DictionaryExample();
        dictionary.addMeaning("apple", "a fruit");
        dictionary.addMeaning("apple", "a tech company");
        dictionary.addMeaning("banana", "a yellow fruit");
        dictionary.addMeaning("cherry", "a small, round, red fruit");

        dictionary.displayDictionary();
    }
}
