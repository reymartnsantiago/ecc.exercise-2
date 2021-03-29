import java.io.IOException;

public class TestClass {

    public static void main(String[] args) throws IOException {
        Exercise2 obj = new Exercise2("table.txt");
        obj.insertTableToFile();
    }
}
