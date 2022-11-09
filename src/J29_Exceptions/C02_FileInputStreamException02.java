package J29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\acer\\IdeaProjects\\javaLearn\\src\\J29_Exceptions\\ebikGabı");
            int k;

            try {
                while ((k = fis.read()) != -1) { //
                    System.out.print((char) k);
                }
                System.out.println("içteki try block'tan selamlar");
            } catch (IOException e) {
                System.out.println("dosya okunamıyor");
                System.out.println("içteki catch block'tan selamlar");
            }
            System.out.println("dıstaki try block'tan selamlar");

        } catch (FileNotFoundException e) { //dosyaya ulasılmazsa bu catch calısır
            System.out.println("dosya ulasılamıyor");
            System.out.println("dıştaki catch block'tan selamlar");
        }
        System.out.println("sorun handle edildi devamke");
    }

    }
