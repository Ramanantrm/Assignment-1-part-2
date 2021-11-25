/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part2task4;

import java.util.Scanner;

/**
 *
 * @author ramananthirugnanasundaram
 */
public class Part2Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myParkingPriceCalculator = new Scanner(System.in);
        System.out.print("Please input the number of minutes your car has parked: ");
        int parkingMinutes = myParkingPriceCalculator.nextInt();

        System.out.printf("%-10s : ", "Parking time (minutes)");
        System.out.printf("%d", parkingMinutes);

        int parkingHours = (int) Math.ceil(parkingMinutes / 60.0);

        System.out.printf("\n%-22s : ", "Parking time (hours)");
        System.out.printf("%d\n", parkingHours);

        double price = parkingHours * 2;

        System.out.printf("%-22s : ", "Price");
        System.out.printf("%.2f\n", price);
    }

}
