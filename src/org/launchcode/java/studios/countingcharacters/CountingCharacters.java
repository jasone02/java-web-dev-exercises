package org.launchcode.java.studios.countingcharacters;

import java.util.Locale;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;

public class CountingCharacters {
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        String text = "";
        //For using text from the command line:
        //Scanner input = new Scanner(System.in);
        //text = input.nextLine();

        //For using text from a file:
        try {
            File textFile = new File("C:\\Users\\61524\\Documents\\itWorksOnMyMachine.txt");
            Scanner input = new Scanner(textFile);
            while (input.hasNextLine()) {
                text += input.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //make text case-insensitive
        text = text.toLowerCase(Locale.ROOT);

        //remove non-letters from text
        String trimmedText = "";
        for(int i = 0; i < text.length(); i++) {
            if(Character.isLetter(text.charAt(i))) {
                trimmedText += text.charAt(i);
            }
        }
        text = trimmedText;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < text.length(); i++) {
            if (map.containsKey(text.charAt(i))) {
                map.put(text.charAt(i), map.get(text.charAt(i)) + 1);
            } else {
                map.put(text.charAt(i), 1);
            }
        }
        for(Map.Entry<Character, Integer> charEntry : map.entrySet()) {
            System.out.println(charEntry.getKey() + ": " + charEntry.getValue());
        }
    }
}
