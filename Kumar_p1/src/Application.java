import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        DuplicateRemover words = new DuplicateRemover();
        words.remove("problem1.txt");
        words.Write("unique_words.txt");
    }
}
