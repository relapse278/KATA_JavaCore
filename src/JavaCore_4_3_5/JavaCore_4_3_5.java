package JavaCore_4_3_5;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class JavaCore_4_3_5 {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("newFile.txt");
        Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.US_ASCII);
        writer.write("Щ");
        writer.flush();

//        Writer writer = new OutputStreamWriter(System.out, StandardCharsets.UTF_8);
//        writer.write("Щ");
//        writer.flush();
//        writer.close();
    }
}
