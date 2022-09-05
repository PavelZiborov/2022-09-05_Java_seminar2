package ru;
import java.io.*;

public class task5 {
    public static void main(String[] args) {

        // создание директории
        File dir = new File("/Users/pavel/Documents/IT/2022-09-05_Java_seminar2/Seminar/");
        File [] filesList = dir.listFiles();
        StringBuilder sb = new StringBuilder();

        for (File file: filesList) {
            if (file.isFile()) {                    // isFile проверяет является ли объект файлом
                sb.append(file.getName()+"\n");
            }
            else {
                sb.append('/' + file.getName()+"\n");
            }
        }
        writeFile(sb.toString());
    }

    public static void writeFile (String text) {

        File file = new File("/Users/pavel/Documents/IT/2022-09-05_Java_seminar2/Seminar/test_file1.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            System.out.println(br.readLine()); // чтение построковое
            // br.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }

//        // добавление в файл все новых и новых строк
//        try (FileWriter fw = new FileWriter(file, true)) {
//            fw.append(text+'\n');
//        } catch (IOException ex) {
//            System.out.println(ex.getLocalizedMessage());
//        }

        // запись строки в файл
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text); // запись построковая
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }

}
