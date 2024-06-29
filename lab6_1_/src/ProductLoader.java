import java.io.*;
import java.nio.Buffer;

public class ProductLoader implements ImportData {

    @Override
    public Object[] importDataFromFile() throws IOException, ClassNotFoundException {
        int lines = 0;
        try {

            BufferedReader m = new BufferedReader(new FileReader("salesproducts.txt"));
            while (m.readLine() != null) {
                lines++;
            }
            m.close();
        } catch (IOException exc) {
            exc.printStackTrace();
        }

        Object[] productArray = new Object[lines];
        ObjectInputStream readFile = new ObjectInputStream(new FileInputStream("salesproducts.txt"));
        for (int i = 0; i < lines; i++) {
            int l = readFile.readInt();
            if (l == 1) {
                productArray[i] = readFile.readObject();
            }
        }

        return new Object[0];
    }
}
