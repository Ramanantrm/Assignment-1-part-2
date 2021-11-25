/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part2task2;

import java.util.Scanner;

/**
 *
 * @author ramananthirugnanasundaram
 */
public class Part2Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myBirthYearCalculator = new Scanner(System.in);
        System.out.print("Please input a birth year : ");
        String birthYear = myBirthYearCalculator.nextLine();

        System.out.printf("\n%-10s : ", "Birth Year");
        System.out.printf("%s", birthYear);

        int century = Integer.parseInt(birthYear.substring(0, 2)) + 1;

        System.out.printf("\n%-10s : ", "Century");
        System.out.printf("%s", century);

        char x = birthYear.charAt(2);

        int decade = Character.getNumericValue(x) * 10;

        System.out.printf("\n%-10s : ", "Decade");
        System.out.printf("%s\n", decade);
    }

}
