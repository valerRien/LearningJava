package org.example.miniprojects.codewars;

public class DecodeTheWoofs {
    public static String woofDecoder(String str) {
        String barking = "just barking!";
        String nothing = "nothing to decode!";
        int w = 0, o = 0, f = 0;
        String result = "";
        str = str.toLowerCase();

        String[] letters = str.split("!");
        for (int i = 0; i < letters.length; i++) {
            int letterCounter = 0;
            String[] counters = letters[i].split("-");
            for (int j = 0; j < counters.length; j++) {
                for (int k = 0; k < counters[j].length(); k++) {
                    if (counters[j].charAt(k) == 'w') {
                        w++;
                    }

                    if (counters[j].charAt(k) == 'o') {
                        o++;
                    }

                    if (counters[j].charAt(k) == 'f') {
                        f++;
                    }
                }
                if (w > 0 && o > 1 && f > 0) {
                    letterCounter++;
                }
                w = 0;
                o = 0;
                f = 0;
            }
            if (letterCounter + 96 > 122) {
                return barking;
            }
            if (letterCounter > 0) {
                char newChar = (char) (letterCounter + 96);
                result += String.valueOf(newChar);
            }
        }

        return result.isEmpty() ? nothing : result;
    }
}
