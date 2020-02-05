package stringTaskTest;

import java.util.HashMap;

public class StringTaskSolver {
    public StringTaskSolver() {}

    public static int sumStringsLength(String s1, String s2) {
        return s1.length() + s2.length();
    }

    public static String getLexCompareMessage(String s1, String s2) {
        if (s1.compareTo(s2)>0) {
            return "Yes";
        }
        else {
            return "No";
        }
    }

    public static String capitalizeJoin(String s1, String s2) {
        return s1.substring(0,1).toUpperCase() + s1.substring(1) +
                " " + s2.substring(0,1).toUpperCase() + s2.substring(1);
    }

    public static String getAreAnagramsMessage(String s1, String s2) {
        if (areAnagrams(s1,s2))
            return "Anagrams";
        else
            return "Not Anagrams";
    }

    private static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        else {
            String s1_lowerCased = s1.toLowerCase(), s2_lowerCased = s2.toLowerCase();
            int len = s1_lowerCased.length();
            HashMap<Character, Integer> s1_charFrequency = new HashMap<>();
            HashMap<Character, Integer> s2_charFrequency = new HashMap<>();
            char s1_charAtIndex, s2_charAtIndex;
            for (int i = 0; i < len; i++) {
                s1_charAtIndex = s1_lowerCased.charAt(i);
                s2_charAtIndex = s2_lowerCased.charAt(i);
                if (!s1_charFrequency.containsKey(s1_charAtIndex)) {
                    s1_charFrequency.put(s1_charAtIndex,1);
                }
                else {
                    s1_charFrequency.replace(s1_charAtIndex,s1_charFrequency.get(s1_charAtIndex)+1);
                }
                if (!s2_charFrequency.containsKey(s2_charAtIndex)) {
                    s2_charFrequency.put(s2_charAtIndex,1);
                }
                else {
                    s2_charFrequency.replace(s2_charAtIndex,s2_charFrequency.get(s2_charAtIndex)+1);
                }
            }
            return s1_charFrequency.equals(s2_charFrequency);
        }
    }
}
