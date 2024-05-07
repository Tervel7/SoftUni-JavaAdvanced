package SetsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Map<String,String> contacts = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        while(!(line.equals("search"))) {
            String[] contactDetails = line.split("-");
            contacts.put(contactDetails[0],contactDetails[1]);
            line = scanner.nextLine();
        }

        line = scanner.nextLine();

        while (!(line.equals("stop"))) {
            if(contacts.containsKey(line))
                System.out.println(line + " -> " + contacts.get(line));
            else
                System.out.println("Contact " + line + " doesn't exist!");

            line = scanner.nextLine();
        }
    }
}
