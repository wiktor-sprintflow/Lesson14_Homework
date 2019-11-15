package task02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CountNumbers {
    private static final String INPUT_FILE = "numbers_file.txt";
    private static List<Integer> list = new ArrayList<>();
    private static Set<Integer> set = new TreeSet<>();

    public static void main(String[] args) {
        readDataFromFile(INPUT_FILE);
        showNumbersAndOccurrences();
    }

    private static void showNumbersAndOccurrences() {
        for (Integer integer : set) {
            System.out.println(integer + " - liczba wystąpień: " + countOccurrences(integer));
        }
    }

    private static int countOccurrences(Integer number) {
        int counter = 0;
        for (Integer integer : list) {
            if (number.equals(integer)) {
                counter++;
            }
        }
        return counter;
    }

    private static void readDataFromFile(String file) {
        File inputFile = new File(file);

        try (FileReader fileReader = new FileReader(inputFile);
             BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(Integer.parseInt(line));
                set.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
