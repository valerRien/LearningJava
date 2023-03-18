package org.example.miniprojects.codewars;

import java.util.ArrayList;

public class ReverseWordsIncludingSpaces {
    public static String reverseWords(final String original) {

        ArrayList<String> listOfWords = new ArrayList<>();
        String word = "";
        if (!original.contains(" ")) {
            listOfWords.add(original);
        } else {
            for (int i = 0; i < original.length(); i++) {
                if (original.charAt(i) == ' ') {
                    if (!word.isEmpty()) {
                        listOfWords.add(word);
                        word = "";
                    }
                    listOfWords.add(String.valueOf(original.charAt(i)));
                } else {
                    word = word + String.valueOf(original.charAt(i));
                }
            }

            //если на конце был пробел, то слово перед ним в цикле не добавится, поэтому проверим и добавим вручную, если последний символ - пробел
            if (original.charAt(original.length() - 1) == ' ') {
                listOfWords.add(listOfWords.size() - 1, word);
            } else {
                //если нет, то на крайнее место - слово
                listOfWords.add(word);
            }
        }
        String result = "";
        for (String wordOrSpace : listOfWords) {
            result += new StringBuilder(wordOrSpace).reverse().toString();
        }

        return result;
    }

}
