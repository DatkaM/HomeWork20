package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    /**
     * Кундорго enum тузунуз (Monday, Tuesday ...)
     * консолдон бир кунду белгилениз . Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм" же Tuesday болсо
     * - анда "Шейшемби куну англис тили сабагын окуйм" деп кунго жараша кайсы сабакты окуганынызды консольго
     * чыгарыныз.
     * Жуманын кундорун кыргыз тилинде корсотунуз.
     */
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        boolean b = true;
        while (b) {
            System.out.println("Bir kundu jazynyz: \n'duishonbu' , 'sheishenbi' , 'sharshenbi' , 'beishenbi' , 'juma' ," +
                    " 'ishenbi' , 'jekshenbi'");
            String word = scanner.nextLine();
            switch (word.toLowerCase(Locale.ROOT)) {
                case "duishonbu":
                    System.out.println(Day.DUISHONBU + " kunu 'java' okuim.");
                    break;
                case "sheishenbi":
                    System.out.println(Day.SHEISHENBI + " kunu 'english' sabagyn okuim.");
                    break;
                case "sharshenbi":
                    System.out.println(Day.SHARSHENBI + " kunu 'java' okuim.");
                    break;
                case "beishenbi":
                    System.out.println(Day.BEISHENBI + " kunu 'soft skill' sabagyn okuim.");
                    break;
                case "juma":
                    System.out.println(Day.JUMA + " kunu 'java' okuim.");
                    break;
                case "ishenbi":
                    System.out.println(Day.ISHENBI + " kunu sabak jok.");
                    break;
                case "jekshenbi":
                    System.out.println(Day.JEKSHENBI + " kunu sabak jok.");
                    break;
                default:
                    System.out.println("Mynday kun jok!");
            }
        }
    }
}