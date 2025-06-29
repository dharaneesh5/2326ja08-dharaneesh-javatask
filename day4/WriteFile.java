import java.io.*;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            System.out.println("Enter lines to write to file (type 'exit' to stop):");
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("exit")) break;
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            System.out.println("Data written to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}