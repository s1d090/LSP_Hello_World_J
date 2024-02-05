package org.howard.edu.lsp.assignment2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCounter {

    public static void main(String[] args) {
   
        String filePath = "src/org/howard/edu/lsp/assignment2/words.txt";
        Map<String, Integer> wordCounts = new HashMap<>();

        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            // processing each line from the file
            lines.forEach(line -> {
                // removing punctuation and splitting by spaces
                String[] words = line.toLowerCase() // 
                        .replaceAll("[^a-zA-Z ]", "") // Replacing non-letters
                        .split("\\s+"); // Splitting on whitespace

                // counting each word that is not trivial
                for (String word : words) {
                    if (word.length() > 3) { 
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            });

            // sorting and printing the word counts
            wordCounts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + "\t" + entry.getValue()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
