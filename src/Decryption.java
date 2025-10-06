// Assignment #11; File Input/Output
// Challenge #3 by Leon Harb

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Decryption {
    public static void main(String[] args) {
        String inputFile = "encrypted.dat";
        String outputFile = "decrypted.dat";

        try (FileInputStream in = new FileInputStream(inputFile);
             FileOutputStream out = new FileOutputStream(outputFile)) {

            int data;
            while ((data = in.read()) != -1) {
                out.write(data - 10);  // Reverse the encryption step
            }

            System.out.println("Decryption complete. Decrypted file: " + outputFile);

        } catch (IOException e) {
            System.out.println("Decryption error: " + e.getMessage());
        }
    }
}
