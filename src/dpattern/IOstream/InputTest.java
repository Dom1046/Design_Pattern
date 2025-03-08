package dpattern.IOstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            /** read()에서 받아온 바이트를 LowerCaseInputStream에서
              * 후처리하고(데코레이터) 출력
             */
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/resources/test.txt")
                    )
            );
            while ((c = in.read()) >= 0) {
                if (c == '\n') System.out.print(" ");
                System.out.print((char) c);
            }
            //Closable 기능 - 자동으로 닫기
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
