package javaapplication16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class JavaApplication16 {

    public static void main(String[] args) throws IOException {
        File input = new File("input.txt");
         FileInputStream in;
        try {
         in   = new FileInputStream(input);
        } catch(FileNotFoundException e) {System.out.println("Извините, такого файла не существует"); return;}
            Scanner scan = new Scanner(in);
            int a;
            try {
             a = scan.nextInt();
            } catch(NoSuchElementException f) {
            System.out.println("Файл является пустым");
            return;
        }
            int i;
            int b = 0;
            int c = 0;

            for (i = 0; i < a; i++) {
                b = scan.nextInt();
                c = c + b;

            }
            File output = new File("result/output.txt");

            PrintStream out = new PrintStream(output);
            out.println(c);
            out.close();
      //  } catch (FileNotFoundException e) {
        //    System.out.println("Извините, такого файла не существует");
    //    } catch(NoSuchElementException f) {
    //        System.out.println("Файл не содержит достаточного количества чисел или является пустым");
      //  }

    }
}
