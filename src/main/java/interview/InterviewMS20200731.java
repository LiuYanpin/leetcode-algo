package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 微软面试题：重新安排行程
 */
public class InterviewMS20200731 {

    public static final String FROM = "from";
    public static final String TO = "to";

    public static List<String> sortTicket(List<List<String>> tickets) {
        HashMap<String, String> ticketMap = new HashMap<>();
        HashMap<String, String> trip = new HashMap<>();
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            ticketMap.put(from, to);
            if (trip.containsKey(from)) {
                trip.remove(from);
            } else {
                trip.put(from, FROM);
            }
            if (trip.containsKey(to)) {
                trip.remove(to);
            } else {
                trip.put(to, TO);
            }
        }
        List<String> result = new ArrayList<>();
        trip.forEach((key, value) -> {
            if (value.equals(FROM)) {
                result.add(0, key);
            }
        });

        while (!ticketMap.isEmpty()) {
            String key = result.get(result.size() - 1);
            result.add(ticketMap.get(key));
            ticketMap.remove(key);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("GZ", "HK");
        List<String> list2 = Arrays.asList("SH", "SZ");
        List<String> list3 = Arrays.asList("SZ", "GZ");
        List<String> list4 = Arrays.asList("BJ", "SH");
        List<List<String>> lists = Arrays.asList(list1, list2, list3, list4);
        List<String> list = sortTicket(lists);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
