package Module10.tests;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayInputStreamTest2 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {1,3,5,7,9};
        InputStream bais = new ByteArrayInputStream(bytes);

        byte[] buffer = new byte[1024];
        int readByteCount = bais.read(buffer, 0, buffer.length);
        System.out.println("readByteCount = " + readByteCount);

        for (int i = 0; i < readByteCount; i++) {
            System.out.println(buffer[i]);
        }
        bais.close();
    }
}
