import java.io.*;
public class Results {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("marks.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int total = 0;
                for (int i = 1; i < parts.length; i++) {
                    total += Integer.parseInt(parts[i]);
                }
                double avg = total / (parts.length - 1.0);
                String result = name + " - Total: " + total + ", Average: " + avg;
                writer.write(result);
                writer.newLine();
            }
            reader.close();
            writer.close();
            System.out.println("Results processed and saved to results.txt");
        } catch (IOException e) {
            System.out.println("File error occurred.");
        }
    }
}