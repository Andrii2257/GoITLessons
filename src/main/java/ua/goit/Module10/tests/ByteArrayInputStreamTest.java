package Module10.tests;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayInputStreamTest {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {1, 3, 5, 7, 9};
        InputStream bais = new ByteArrayInputStream(bytes);

        while (bais.available() > 0) {
            byte currentByte = (byte) bais.read();
            System.out.println(currentByte);
        }
        bais.close();
    }
}
