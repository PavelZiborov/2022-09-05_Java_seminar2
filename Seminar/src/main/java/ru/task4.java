package ru;

import java.io.*;
import java.nio.file.Files;

public class task4 {
    public static void main(String[] args) {

        // 100 посторений "тест"
        // метод который запишет в файл
        String text = "Привет!";
        String newText = repeat(text, 100);
        writeFile(newText);

        // new FileReader(file).read() читать строки

//        Files.newBufferedReader()
//        Files.readAllLines();
    }

    public static String repeat (String text, int n) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(text);
        }
        return str.toString();
    }

    public static void writeFile (String text) {

        File file = new File("/Users/pavel/Documents/IT/2022-09-05_Java_seminar2/Seminar/test_file.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println(br.readLine()); // чтение построковое
            // br.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }

        try (PrintWriter wr = new PrintWriter(file)) {
            wr.println(text); // запись построковая
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
