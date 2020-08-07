package PointToOffer;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 剑指 Offer 50. 第一个只出现一次的字符
 */
public class Offer50 {
    public char firstUniqChar(String s) {
        char[] array = s.toCharArray();
        LinkedHashMap<Character, Boolean> map = new LinkedHashMap<>();
        for (char ch: array
             ) {
            map.computeIfPresent(ch, (k, v) -> false);
            map.putIfAbsent(ch, true);
        }
        for (Map.Entry<Character, Boolean> entry: map.entrySet()
             ) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        return ' ';
    }
}
