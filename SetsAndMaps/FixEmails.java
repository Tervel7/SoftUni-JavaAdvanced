package SetsAndMaps;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixEmails {
    public static void main(String[] args) {
        Map<String, String> usersEmails = new LinkedHashMap<>();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while(!(line.equals("stop"))) {
            String name = line;
            String email = scanner.nextLine();;

            if (email.indexOf(".com")==-1 && email.indexOf(".uk")==-1 && email.indexOf(".us")==-1) {
                usersEmails.put(name, email);
            }

            line = scanner.nextLine();
        }

        for(Map.Entry<String, String> entry : usersEmails.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
