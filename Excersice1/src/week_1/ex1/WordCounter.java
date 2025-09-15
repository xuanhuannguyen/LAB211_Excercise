/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week_1.ex1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class WordCounter {
    private String text;

    public WordCounter(String text) {
        this.text = text.toLowerCase();
    }

    public Map<String, Integer> countWords() {
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        StringTokenizer st = new StringTokenizer(text);
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public Map<Character, Integer> countChars() {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (c != ' ') {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }
        return charCount;
    }

}
