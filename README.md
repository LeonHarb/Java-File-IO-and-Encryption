# Java File I/O and Encryption

This repository contains a collection of Java programs demonstrating file input/output operations, binary file handling, and simple encryption/decryption techniques. The goal of these exercises is to practice reading, writing, and manipulating data stored in both text and binary files.

---

## 📘 Overview

This project includes three main challenges:

### 1. FileSum.java  
Prompts the user to enter numbers (ending with -1), writes them to a text file, and then reads the file to calculate and print the total sum.

### 2. BinarySum.java  
Takes user-entered numbers, stores them in a binary file (`numbers.dat`), and reads them back to compute the sum using `DataOutputStream` and `DataInputStream`.

### 3. Encryption.java & Decryption.java  
Implements a simple file encryption system that shifts character codes to encode data.  
The decryption program reverses the process to restore the original file.

---

## ⚙️ Technologies Used

- **Language:** Java  
- **IDE:** Eclipse  
- **Key Classes:**  
  - FileReader / FileWriter  
  - BufferedReader / BufferedWriter  
  - FileInputStream / FileOutputStream  
  - DataInputStream / DataOutputStream  
  - IOException / FileNotFoundException  

---

## 💡 Concepts Practiced

- File Input/Output Streams  
- Reading and Writing Text & Binary Files  
- Exception Handling (`IOException`, `FileNotFoundException`)  
- Data Validation and Summation  
- Basic Encryption and Decryption Algorithms  
- Handling User Input and Loops  

---

## ▶️ How to Run

1. Open the project in **Eclipse** or any Java IDE.  
2. Navigate to the `src` folder and locate the desired `.java` file.  
3. Run each program individually using the built-in run command or `javac` and `java` in the terminal:  
   ```bash
   javac FileSum.java
   java FileSum
   ```
4. Follow on-screen prompts to enter input values.  
5. View generated text or binary files in the project directory.  

---

## 📂 File Structure

```
📦 Java-File-IO-and-Encryption
 ┣ 📂 src
 ┃ ┣ 📜 FileSum.java
 ┃ ┣ 📜 BinarySum.java
 ┃ ┣ 📜 Encryption.java
 ┃ ┗ 📜 Decryption.java
 ┣ 📜 numbers.txt
 ┣ 📜 numbers.dat
 ┣ 📜 encrypted.dat
 ┣ 📜 decrypted.dat
 ┗ 📜 README.md
```

---

## 🧠 Author
Developed as part of a Java programming assignment to explore file I/O and error handling.
