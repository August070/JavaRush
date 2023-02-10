package ua.javarush.task.pro.task09.task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer StringTokenizer = new StringTokenizer(query, delimiter);
        int i = 0;
        String[] result = new String[0];
        while (StringTokenizer.hasMoreTokens()) {
            result = new String[StringTokenizer.countTokens()];
            result[i++] = StringTokenizer.nextToken();
        }

        return result;
    }
}
