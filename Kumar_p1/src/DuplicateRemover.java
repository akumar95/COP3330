import java.util.*;
import java.io.*;

public class DuplicateRemover {

    public Set<String> uniqueWords = new HashSet<String>();

    public void remove(String dataFile) {
        try {
            Scanner scnr = new Scanner(new File(dataFile));
            while (scnr.hasNext()) {
                String inc = scnr.next();
                uniqueWords.add(inc);
            }
            scnr.close();

        } catch (FileNotFoundException e) {
            System.out.println("Invalid file name.");
        }
    }

    public void Write(String outputFile) throws IOException {

        try {
            File file = new File(outputFile);
            if (file.exists()) {
                file.delete();
            }
            FileWriter fw = new FileWriter(file);
            Iterator<String> write = uniqueWords.iterator();
            while (write.hasNext()) {
                String writer = write.next();
                fw.write(writer + "\n");
                fw.close();
            }

        } catch (Exception e) {
            System.out.println("Cannot write to file.");
        }

    }
}