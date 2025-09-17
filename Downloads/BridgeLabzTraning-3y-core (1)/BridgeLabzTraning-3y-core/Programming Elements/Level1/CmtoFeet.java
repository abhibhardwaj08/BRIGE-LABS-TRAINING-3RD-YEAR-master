package practice;

import java.util.Scanner;

public class CmtoFeet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = sc.nextDouble();

        double totalInches = heightCm / 2.54;

        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f%n", heightCm, feet, inches);

        sc.close();
    
    }
}
