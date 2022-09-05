package ru;

import java.io.*;
import java.util.Arrays;

public class DZ_1 {
    public static void main(String[] args) {
        /*
        1. Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида

        1 Расширение файла: txt
        2 Расширение файла: pdf
        3 Расширение файла:
        4 Расширение файла: jpg
         */

        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/seminar");
        File dir = new File(pathDir);
        File [] filesList = dir.listFiles();
        StringBuilder sb = new StringBuilder();
        String extension = "";
        String name = "";

        for (File file: filesList) {
            if (file.isFile()) {                                   // isFile проверяет является ли объект файлом
                if (file.getName().split("\\.").length == 1) {
                    name = file.getName();
                    extension = "";
                    sb.append("Файл " + name + " имеет расширение: " + extension + "\n");
                }
                else {
                    name = file.getName().split("\\.")[0];       // экранирование "\\"
                    extension = file.getName().split("\\.")[1];
                    sb.append("Файл " + name + " имеет расширение: " + extension + "\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
