// Assignment #11; File Input/Output
// Challenge #3 by Leon Harb

import java.io.*;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        String inputFile = "original.dat";
        String outputFile = "encrypted.dat";
        Scanner scanner = new Scanner(System.in);

        // 1. Ask user to enter text to encrypt
        System.out.println("Enter text to encrypt (this will be written to original.dat):");
        String userInput = scanner.nextLine();

        // 2. Write user input to original.dat
        try (FileOutputStream fos = new FileOutputStream(inputFile)) {
            fos.write(userInput.getBytes());
            System.out.println("Original text saved to " + inputFile);
        } catch (IOException e) {
            System.out.println("Error writing input file: " + e.getMessage());
            return;
        }

        // 3. Encrypt content from original.dat into encrypted.dat
        try (FileInputStream in = new FileInputStream(inputFile);
             FileOutputStream out = new FileOutputStream(outputFile)) {

            int data;
            while ((data = in.read()) != -1) {
                out.write(data + 10);  // Simple encryption
            }

            System.out.println("Encryption complete. Encrypted file: " + outputFile);

        } catch (IOException e) {
            System.out.println("Encryption error: " + e.getMessage());
        }

        scanner.close();
    }
}
