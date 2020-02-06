package stringTaskTest;

import java.util.HashMap;
import java.util.Map;

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
            Map<Character, Integer> s1charFrequency = new HashMap<>();
            Map<Character, Integer> s2charFrequency = new HashMap<>();
            char s1charAtIndex, s2charAtIndex;

            for (int i = 0; i < len; i++) {
                s1charAtIndex = s1_lowerCased.charAt(i);
                s2charAtIndex = s2_lowerCased.charAt(i);

                if (!s1charFrequency.containsKey(s1charAtIndex)) {
                    s1charFrequency.put(s1charAtIndex,1);
                }
                else {
                    s1charFrequency.replace(s1charAtIndex,s1charFrequency.get(s1charAtIndex)+1);
                }
                if (!s2charFrequency.containsKey(s2charAtIndex)) {
                    s2charFrequency.put(s2charAtIndex,1);
                }
                else {
                    s2charFrequency.replace(s2charAtIndex,s2charFrequency.get(s2charAtIndex)+1);
                }
            }
            return s1charFrequency.equals(s2charFrequency);
        }
    }
}
