import java.io.BufferedReader;
import java.io.IOException;
import java.io.*;

public class Next {
    public static  void main(String[] args) throws IOException {
        System.out.println(1024);

        int a = 10;
        int b = 0;
        int c = 0;

        try {
            c = a/b;

        } catch (ArithmeticException e) {

            System.out.println("无效的数字");
        }

    }
}
