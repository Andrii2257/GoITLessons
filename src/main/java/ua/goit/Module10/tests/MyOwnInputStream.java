package Module10.tests;

import java.nio.charset.StandardCharsets;

public class MyOwnInputStream {
    public MyOwnInputStream(String input) {
        byte[] bytes = input.getBytes(StandardCharsets.UTF_8);
    }
}
