// Assignment #11; File Input/Output
// Challenge #2 by Leon Harb

import java.io.*;
import java.util.Scanner;

public class BinarySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "numbers.dat";

        // 1. Write to binary file
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(filename))) {
            System.out.println("Enter numbers (-1 to end):");

            while (true) {
                int num = scanner.nextInt();
                if (num == -1) break;
                out.writeInt(num);
            }

        } catch (IOException e) {
            System.out.println("Error writing to binary file: " + e.getMessage());
            return;
        }

        // 2. Read from binary file and calculate sum
        int sum = 0;

        try (DataInputStream in = new DataInputStream(new FileInputStream(filename))) {
            while (true) {
                sum += in.readInt();
            }
        } catch (EOFException e) {
            // End of file reached – expected
        } catch (IOException e) {
            System.out.println("Error reading from binary file: " + e.getMessage());
            return;
        }

        System.out.println("Sum of numbers: " + sum);
        scanner.close();
    }
}
