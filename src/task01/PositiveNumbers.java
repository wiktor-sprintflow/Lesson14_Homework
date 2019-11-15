package task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        List<Integer> list = createList();
        System.out.println("Lista w kolejności odwrotnej: " + printReversedList(list));
        System.out.println("Suma listy: " + printSummedList(list) + sumList(list));
        System.out.println("Najmniejszy element listy to: " + findMin(list));
        System.out.println("Największy element listy to: " + findMax(list));
    }

    public static List<Integer> createList() {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Podaj liczbę nieujemną: ");
        int number = input.nextInt();
        input.nextLine();

        while (number >= 0) {
            list.add(number);
            System.out.print("Podaj liczbę nieujemną: ");
            number = input.nextInt();
            input.nextLine();
        }
        return list;
    }

    private static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (Integer num : list) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    private static int findMin(List<Integer> list) {
        int min = list.get(0);
        for (Integer num : list) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    private static String printReversedList(List<Integer> list) {
        String reversedList = "";
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList += list.get(i) + " ";
        }
        return reversedList;
    }

    private static int sumList(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    private static String printSummedList(List<Integer> list) {
        String summedList = "" + list.get(0);
        for (int i = 1; i < list.size(); i++) {
            summedList += " + " + list.get(i);
        }
        summedList += " = ";
        return summedList;
    }
}
