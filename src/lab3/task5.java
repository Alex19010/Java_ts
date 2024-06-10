import java.io.*;

public class File_ {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Problem5 <string> <filename>");
            return;
        }

        String target = args[0];
        String filename = args[1];

        try {
            removeText(target, filename);
            System.out.println("All occurrences of \"" + target + "\" removed from " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void removeText(String target, String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException("Error: File " + filename + " does not exist.");
        }

        File tempFile = new File("temp.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String line;
        while ((line = reader.readLine()) != null) {
            line = line.replace(target, "");
            writer.write(line);
            writer.newLine();
        }

        reader.close();
        writer.close();

        if (!file.delete() || !tempFile.renameTo(file)) {
            throw new IOException("Error: Unable to update file.");
        }
    }
}
