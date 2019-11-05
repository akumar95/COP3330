import java.io.*;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

    public Map<String, Integer> wordCounter;

    public void write(String dataFile) throws IOException {

        try {
            File file = new File(dataFile);
            if (file.exists()) {
                file.delete();
            }
            FileWriter fw = new FileWriter(file);
            for(Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
                fw.write(entry.getKey() + "Occurs" +entry.getValue());
            }


        } catch (FileNotFoundException e) {
            System.out.println("Cannot write to file.");
        }

    }

    public void count(String dataFile) {
        try {
            String wordsCounted;
            Scanner count = new Scanner(new File(dataFile));
            while (count.hasNext()) {
                wordsCounted = count.next();
                wordCounter.put(wordsCounted, 1);
                count.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot read file.");
        }
    }
}

