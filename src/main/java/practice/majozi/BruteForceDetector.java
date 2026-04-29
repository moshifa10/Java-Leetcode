package practice.majozi;

import java.util.*;

public class BruteForceDetector {

    public static List<String> detectBruteForce(String[] logs) {
        Map<String, Integer> counts = new HashMap<>();
        Set<String> suspicious = new HashSet<>();

        for (String log : logs) {
            String[] parts = log.split(" ");
            String ip = parts[0];
            String status = parts[1];

            if (status.equals("LOGIN_FAIL")) {
                counts.put(ip, counts.getOrDefault(ip, 0) + 1);
                if (counts.get(ip) >= 3) {
                    suspicious.add(ip);
                }
            } else if (status.equals("LOGIN_SUCCESS")) {
                // This is the reset: if they succeed, they aren't brute-forcing anymore
                counts.put(ip, 0);
            }
        }

        List<String> result = new ArrayList<>(suspicious);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        String[] logs = {
                "192.168.1.1 LOGIN_FAIL user=admin",
                "192.168.1.1 LOGIN_FAIL user=admin",
                "192.168.1.1 LOGIN_FAIL user=root",
                "10.0.0.5 LOGIN_FAIL user=test",
                "10.0.0.5 LOGIN_SUCCESS user=test"
        };

        System.out.println("Suspicious IPs: " + detectBruteForce(logs));
    }
}