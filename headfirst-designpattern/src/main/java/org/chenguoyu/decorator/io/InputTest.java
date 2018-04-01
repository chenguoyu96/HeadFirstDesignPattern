package org.chenguoyu.decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author chenguoyu
 * @date 2018-04-01
 */
public class InputTest {
    public static void main(String[] args) {
        InputStream in = null;
        int c;


        try {
             in =
                new LowerCaseInputStream(
                        new BufferedInputStream(
                                new FileInputStream("src/main/java/org/chenguoyu/decorator/io/test.txt")));
            while ((c = in.read()) > 0) {
            System.out.print((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
