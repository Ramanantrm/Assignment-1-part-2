/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part2task3;

import java.util.Scanner;

/**
 *
 * @author ramananthirugnanasundaram
 */
public class Part2Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner mySimpleStatisticCalculator = new Scanner(System.in);
        System.out.print("Please input 5 numbers seperated by space: ");

        double number1;
        number1 = mySimpleStatisticCalculator.nextDouble();

        double number2;
        number2 = mySimpleStatisticCalculator.nextDouble();

        double number3;
        number3 = mySimpleStatisticCalculator.nextDouble();

        double number4;
        number4 = mySimpleStatisticCalculator.nextDouble();

        double number5;
        number5 = mySimpleStatisticCalculator.nextDouble();

        System.out.printf("\n%-18s : ", "Numbers");
        System.out.printf("%.2f, %.2f, %.2f, %.2f, %.2f", number1, number2, number3, number4, number5);

        double mean = (number1 + number2 + number3 + number4 + number5) / 5;

        System.out.printf("\n%-18s : ", "Mean");
        System.out.printf("%.2f", mean);

        double minimum = number1;

        if (number2 < minimum) {
            minimum = number2;
        }

        if (number3 < minimum) {
            minimum = number3;
        }
        if (number4 < minimum) {
            minimum = number4;
        }
        if (number5 < minimum) {
            minimum = number5;
        }

        System.out.printf("\n%-18s : ", "Minimum");
        System.out.printf("%.2f", minimum);

        double maximum = number1;

        if (number2 > maximum) {
            maximum = number2;
        }

        if (number3 > maximum) {
            maximum = number3;
        }
        if (number4 > maximum) {
            maximum = number4;
        }
        if (number5 > maximum) {
            maximum = number5;
        }

        System.out.printf("\n%-18s : ", "Maximum");
        System.out.printf("%.2f", maximum);

        double standardDeviation = (Math.pow((number1 - mean), 2)
                + Math.pow((number2 - mean), 2)
                + Math.pow((number3 - mean), 2)
                + Math.pow((number4 - mean), 2)
                + Math.pow((number5 - mean), 2)) / 5;

        System.out.printf("\n%-10s : ", "Standard deviation");
        System.out.printf("%.2f\n", Math.sqrt(standardDeviation));
    }

}
