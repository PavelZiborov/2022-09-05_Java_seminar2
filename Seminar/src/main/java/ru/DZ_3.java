package ru;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class DZ_3 {
    public static void main(String[] args) {
        /*
        3**** Дана json строка (можно сохранить в файл и читать из файла)
        [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

        Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

        Пример вывода:
        Студент Иванов получил 5 по предмету Математика.
        Студент Петрова получил 4 по предмету Информатика.
        Студент Краснов получил 5 по предмету Физика.
         */

        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        System.out.println(ParseJson(jsonString));
    }

    public static String ParseJson (String str) {

        StringBuilder resultStringB = new StringBuilder();
        //        String resultStr = str.substring(str.indexOf('.') + 1, str.indexOf(':'));
        String [] newStringArray = str.replace("[", "").replace("]","").split("},\\{");
        String [] newStringArray2;
        String [] newStringArray3;
        ArrayList<String> arr = new ArrayList<String>();

        for (int i = 0; i < newStringArray.length; i++) {
            newStringArray2 = newStringArray[i].split(",");
            for (int j = 0; j < newStringArray2.length; j++) {
                newStringArray3 = newStringArray2[j].split(":");
                arr.add(newStringArray3[1].replace("\"","").replace("}",""));
            }
        }

        resultStringB.append("Студент " + arr.get(0) + " получил " + arr.get(1) + " по предмету " + arr.get(2) + "\n");
        resultStringB.append("Студент " + arr.get(3) + " получил " + arr.get(4) + " по предмету " + arr.get(5) + "\n");
        resultStringB.append("Студент " + arr.get(6) + " получил " + arr.get(7) + " по предмету " + arr.get(8));

        return resultStringB.toString();
    }
}
