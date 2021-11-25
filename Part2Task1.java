/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part2task1;

import java.util.Scanner;

/**
 *
 * @author ramananthirugnanasundaram
 */
public class Part2Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myWebAddressExtractor = new Scanner(System.in);
        System.out.print("Please input a web address: ");
        String webAddress = myWebAddressExtractor.nextLine().toLowerCase();

        int p1 = webAddress.indexOf('.');
        int p2 = webAddress.lastIndexOf('.');

        System.out.printf("%-9s : ", "Address");
        System.out.printf("%s", webAddress);

        String heading = webAddress.substring(0, p1);

        System.out.printf("\n%-9s : ", "Heading");
        System.out.printf("%s", heading);

        String company = webAddress.substring(p1 + 1, p2);

        System.out.printf("\n%-9s : ", "Company");
        System.out.printf("%s", company);

        String extension = webAddress.substring(p2 + 1);

        System.out.printf("\n%-5s : ", "Extension");
        System.out.printf("%s\n", extension);

    }

}
