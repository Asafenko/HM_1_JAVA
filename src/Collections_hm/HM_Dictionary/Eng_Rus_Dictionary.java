package Collections_hm.HM_Dictionary;

import java.util.*;

public class Eng_Rus_Dictionary {
    private HashMap<String, String> dictionary;
    private HashMap<String, Integer> wordCount;

    public Eng_Rus_Dictionary() {
        dictionary = new HashMap<>();
        wordCount = new HashMap<>();
    }

    public void addWord(String word, String translation) {
        dictionary.put(word, translation);
        wordCount.put(word, 0);
    }

    public void updateTranslation(String word, String newTranslation) {
        if (dictionary.containsKey(word)) {
            dictionary.put(word, newTranslation);
        } else {
            System.out.println("Слово не найдено в словаре.");
        }
    }

    public void deleteTranslation(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
            wordCount.remove(word);
        } else {
            System.out.println("Слово не найдено в словаре.");
        }
    }

    public void deleteWord(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
            wordCount.remove(word);
        } else {
            System.out.println("Слово не найдено в словаре.");
        }
    }

    public void displayTranslation(String word) {
        if (dictionary.containsKey(word)) {
            System.out.println(word + ": " + dictionary.get(word));
            wordCount.put(word, wordCount.get(word) + 1);
        } else {
            System.out.println("Слово не найдено в словаре.");
        }
    }

    public void displayPopularWords() {
        List<Map.Entry<String, Integer>> popularWords = new ArrayList<>(wordCount.entrySet());
        popularWords.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println("Топ 10 самых популярных слов:");
        for (int i = 0; i < 10 && i < popularWords.size(); i++) {
            System.out.println(popularWords.get(i).getKey());
        }
    }

    public void displayUnpopularWords() {
        List<Map.Entry<String, Integer>> unpopularWords = new ArrayList<>(wordCount.entrySet());
        unpopularWords.sort(Map.Entry.comparingByValue());
        System.out.println("Топ 10 самых непопулярных слов:");
        for (int i = 0; i < 10 && i < unpopularWords.size(); i++) {
            System.out.println(unpopularWords.get(i).getKey());
        }
    }

}
