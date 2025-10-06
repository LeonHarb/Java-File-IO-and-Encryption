// Assignment #11; File Input/Output
// Challenge #1 by Leon Harb

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String filename = "numbers.txt";

        // 1. Write numbers to file
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            System.out.println("Enter numbers (-1 to end):");

            while (true) {
                int num = input.nextInt();
                if (num == -1) break;
                writer.print(num + " ");
            }

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
            
        }

        // 2. Read numbers from file and calculate sum
        int sum = 0;

        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextInt()) {
                sum += fileScanner.nextInt();
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
            return;
        }

        System.out.println("Sum of numbers: " + sum);
        input.close();
    }
}
